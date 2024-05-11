package org.d3if3009.listnote.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import org.d3if3009.listnote.model.Note

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