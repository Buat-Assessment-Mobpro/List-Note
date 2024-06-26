package org.d3if3009.listnote.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import org.d3if3009.listnote.model.Note

@Composable
fun NoteItemUI(
    note: Note,
    modifier: Modifier = Modifier,
    onDeleteClicked: () -> Unit,
    onShareClicked: (String) -> Unit
) {
    var showDeleteDialog by remember { mutableStateOf(false) }

    fun showDeleteConfirmationDialog() {
        showDeleteDialog = true
    }

    fun dismissDeleteConfirmationDialog() {
        showDeleteDialog = false
    }

    if (showDeleteDialog) {
        AlertDialog(
            onDismissRequest = { dismissDeleteConfirmationDialog() },
            title = { Text(text = "Hapus Note") },
            text = { Text(text = "Apakah Anda yakin ingin menghapus catatan ini?") },
            confirmButton = {
                Button(
                    onClick = {
                        onDeleteClicked()
                        dismissDeleteConfirmationDialog()
                    }
                ) {
                    Text(text = "Hapus Note")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        dismissDeleteConfirmationDialog()
                    }
                ) {
                    Text(text = "Batal")
                }
            }
        )
    }

    Card(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(note.color))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = note.title,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.secondary,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = note.content,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.tertiary,
                        maxLines = 10,
                        overflow = TextOverflow.Ellipsis
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                        horizontalArrangement = Arrangement.End
                    ) {
                        IconButton(
                            onClick = { onShareClicked(note.content) },
                        ) {
                            Icon(
                                imageVector = Icons.Default.Share,
                                contentDescription = "Share Note",
                                tint = MaterialTheme.colorScheme.onSurface
                            )
                        }

                        IconButton(
                            onClick = { showDeleteConfirmationDialog() },
                        ) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = "Delete Note",
                                tint = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
            }
        }
    }
}
