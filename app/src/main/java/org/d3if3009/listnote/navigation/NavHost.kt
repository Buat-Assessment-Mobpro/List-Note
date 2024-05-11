package org.d3if3009.listnote.navigation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.d3if3009.listnote.ui.screen.AboutScreen
import org.d3if3009.listnote.ui.screen.AddEditScreenUI
import org.d3if3009.listnote.ui.screen.NotesScreen

@Composable
fun AppNavHost() {
    Surface(color = MaterialTheme.colorScheme.background) {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = NavScreen.NotesScreen.route
        ) {
            composable(route = NavScreen.NotesScreen.route) {
                NotesScreen(navController = navController, LocalContext.current)

            }

            composable(route = NavScreen.AboutScreen.route) {
                AboutScreen(navController = navController, LocalContext.current)

            }

            composable(
                route = NavScreen.AddEditNoteScreen.route,
                arguments = listOf(
                    navArgument(name = "noteId") {
                        type = NavType.IntType
                        defaultValue = -1
                    },

                    navArgument(name = "noteColor") {
                        type = NavType.IntType
                        defaultValue = -1
                    },
                )
            ) {
                val color = it.arguments?.getInt("noteColor") ?: -1
                AddEditScreenUI(navController = navController, noteColor = color)
            }

        }
    }

}