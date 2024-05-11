package org.d3if3009.listnote.domain.usecases

import org.d3if3009.listnote.domain.repository.NoteRepository
import org.d3if3009.listnote.model.Note

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}