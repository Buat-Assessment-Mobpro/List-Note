package org.d3if3009.listnote.ui.screen

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import org.d3if3009.listnote.presentation.notes.NotesViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AboutScreen(
    navController: NavController,
    context: Context,
) {

    Scaffold(
        content = {
            Content(
                navController = navController,
            )
        }
    )

}


@Composable
fun Content(
    navController: NavController,
    viewModel: NotesViewModel = hiltViewModel()
) {
    val state = viewModel.state.value


    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { navController.popBackStack() }
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Sort")
            }

            Text(
                text = "Tentang Aplikasi",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.weight(1f)
            )
        }

        Text(
            text = "Deskripsi Aplikasi",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = "Aplikasi List Note adalah sebuah aplikasi sederhana yang memungkinkan pengguna untuk membuat, mengedit, dan mengatur catatan mereka dengan mudah. Dengan antarmuka yang ramah pengguna dan fitur-fitur yang intuitif, aplikasi ini dirancang untuk membantu pengguna dalam mengelola dan menyusun ide, tugas, dan informasi penting lainnya dengan cepat dan efisien.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "About Aplikasi",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = "List Note adalah hasil dari kerja Muhammad Raihan Fahrifi. Kami selalu berusaha untuk meningkatkan pengalaman pengguna dan menerima umpan balik dari pengguna kami untuk terus mengembangkan aplikasi ini menjadi lebih baik.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(horizontal = 16.dp)
        )


    }
}

