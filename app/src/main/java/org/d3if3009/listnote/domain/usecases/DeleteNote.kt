package org.d3if3009.listnote.domain.usecases

import com.example.notesappcompose.feature_note.domain.model.Note
import com.example.notesappcompose.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}