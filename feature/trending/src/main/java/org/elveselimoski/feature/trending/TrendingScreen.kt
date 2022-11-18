package org.elveselimoski.feature.trending

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import org.elveselimoski.itube.core.designsystem.theme.ITubeTheme
import org.elveselimoski.itube.core.ui.DevicePreviews

@Composable
internal fun TrendingRoute(
    modifier: Modifier = Modifier,
    viewModel: TrendingViewModel = hiltViewModel()
) {
    TrendingScreen(
        modifier = modifier
    )
}

@Composable
internal fun TrendingScreen(
    modifier: Modifier = Modifier,
) {
    Text(text = "Trending", modifier = modifier)
}

@DevicePreviews
@Composable
fun TrendingScreenPopulatedFeed() {
    BoxWithConstraints {
        ITubeTheme {
            TrendingScreen()
        }
    }
}
