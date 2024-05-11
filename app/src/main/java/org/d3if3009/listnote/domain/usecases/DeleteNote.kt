package org.d3if3009.listnote.domain.usecases

import org.d3if3009.listnote.domain.repository.NoteRepository
import org.d3if3009.listnote.model.Note


class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}