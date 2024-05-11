package org.d3if3009.listnote.domain.repository

import kotlinx.coroutines.flow.Flow
import org.d3if3009.listnote.model.Note

interface NoteRepository {

    fun getNotes() : Flow<List<Note>>

    suspend fun getNoteById(id:Int) : Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}