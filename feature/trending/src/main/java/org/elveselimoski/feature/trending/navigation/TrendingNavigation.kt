package org.elveselimoski.feature.trending.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import org.elveselimoski.feature.trending.TrendingRoute

const val trendingNavigationRoute = "trending_route"

fun NavController.navigateToTrending(navOptions: NavOptions? = null) {
    this.navigate(trendingNavigationRoute, navOptions)
}

fun NavGraphBuilder.trendingScreen() {
    composable(route = trendingNavigationRoute) {
        TrendingRoute()
    }
}
