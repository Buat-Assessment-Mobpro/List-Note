package org.d3if3009.listnote.presentation.notes

import com.example.notesappcompose.feature_note.data.data_source.ViewType
import com.example.notesappcompose.feature_note.domain.model.Note
import com.example.notesappcompose.feature_note.domain.utils.NoteOrder
import com.example.notesappcompose.feature_note.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,
    val currentView: ViewType = ViewType.LIST
)
