package org.elveselimoski.itube.feature.library

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import org.elveselimoski.itube.core.designsystem.theme.ITubeTheme
import org.elveselimoski.itube.core.ui.DevicePreviews

@Composable
internal fun LibraryRoute(
    modifier: Modifier = Modifier,
    viewModel: LibraryViewModel = hiltViewModel()
) {
    LibraryScreen(
        modifier = modifier
    )
}

@Composable
internal fun LibraryScreen(
    modifier: Modifier = Modifier,
) {
    Text(text = "Library", modifier = modifier)
}

@DevicePreviews
@Composable
fun LibraryScreenPopulatedFeed() {
    BoxWithConstraints {
        ITubeTheme {
            LibraryScreen()
        }
    }
}
