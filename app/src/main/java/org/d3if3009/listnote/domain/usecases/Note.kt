package org.d3if3009.listnote.domain.usecases

import org.d3if3009.listnote.domain.usecases.AddNote
import org.d3if3009.listnote.domain.usecases.DeleteNote
import org.d3if3009.listnote.domain.usecases.GetNote
import org.d3if3009.listnote.domain.usecases.GetNotes

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getIndividualNote : GetNote

)
