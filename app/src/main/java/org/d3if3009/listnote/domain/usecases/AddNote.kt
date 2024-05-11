package org.d3if3009.listnote.domain.usecases

import org.d3if3009.listnote.domain.repository.NoteRepository
import org.d3if3009.listnote.model.InvalidNoteException
import org.d3if3009.listnote.model.Note


class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Judul Catatan tidak boleh Kosong!")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Isi Catatan tidak boleh Kosong!")
        }

        repository.insertNote(note)
    }
}