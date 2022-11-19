package org.elveselimoski.itube.feature.library.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import org.elveselimoski.itube.feature.library.LibraryRoute

const val libraryNavigationRoute = "library_route"

fun NavController.navigateToLibrary(navOptions: NavOptions? = null) {
    this.navigate(libraryNavigationRoute, navOptions)
}

fun NavGraphBuilder.libraryScreen() {
    composable(route = libraryNavigationRoute) {
        LibraryRoute()
    }
}
