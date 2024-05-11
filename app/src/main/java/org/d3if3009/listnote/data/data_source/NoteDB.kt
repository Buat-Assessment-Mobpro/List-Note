package org.d3if3009.listnote.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notesappcompose.feature_note.domain.model.Note
import org.d3if3009.listnote.data.data_source.NoteDao

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDB : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object{
        const val DB_NAME = "notes_db"
    }
}