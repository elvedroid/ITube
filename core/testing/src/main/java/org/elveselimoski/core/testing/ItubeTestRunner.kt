package org.elveselimoski.core.testing

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

/**
 * A custom runner to set up the instrumented application class for tests.
 */
class ItubeTestRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader?, name: String?, context: Context?): Application {
        return super.newApplication(cl, name, context)
    }
}