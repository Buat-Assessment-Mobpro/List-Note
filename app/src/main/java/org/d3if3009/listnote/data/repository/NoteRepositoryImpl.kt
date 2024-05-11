package org.d3if3009.listnote.data.repository

import org.d3if3009.listnote.data.data_source.NoteDao
import kotlinx.coroutines.flow.Flow
import org.d3if3009.listnote.domain.repository.NoteRepository
import org.d3if3009.listnote.model.Note

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}
