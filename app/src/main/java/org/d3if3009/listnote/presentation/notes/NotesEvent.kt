package org.d3if3009.listnote.presentation.notes

import org.d3if3009.listnote.model.Note
import org.d3if3009.listnote.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()

    object ChangeViewToList : NotesEvent()

    object ChangeViewToGrid : NotesEvent()
}
