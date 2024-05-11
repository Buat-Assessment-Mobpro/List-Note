package org.d3if3009.listnote.presentation.notes

import org.d3if3009.listnote.data.data_source.ViewType
import org.d3if3009.listnote.model.Note
import org.d3if3009.listnote.utils.NoteOrder
import org.d3if3009.listnote.utils.OrderType


data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,
    val currentView: ViewType = ViewType.LIST
)
