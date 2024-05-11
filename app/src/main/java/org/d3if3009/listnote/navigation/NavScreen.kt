package org.d3if3009.listnote.navigation

sealed class NavScreen(val route: String) {
    object NotesScreen : NavScreen("notes_screen")
    object AddEditNoteScreen : NavScreen("add_edit_note_screen")
    object AboutScreen : NavScreen("about_note_screen")
}