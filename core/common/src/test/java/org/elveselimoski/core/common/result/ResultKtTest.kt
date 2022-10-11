package org.elveselimoski.core.common.result

import app.cash.turbine.test
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class ResultKtTest {

    @Test
    fun `Result catches errors`() = runTest {
        flow {
            emit(2)
            throw Exception("Test Done")
        }.asResult()
            .test {
                assertEquals(Result.Loading, awaitItem())
                assertEquals(Result.Success(2), awaitItem())
                when (val result = awaitItem()) {
                    is Result.Error -> assertEquals("Test Done", result.exception?.message)
                    else -> throw IllegalStateException("The flow should have emitted an Error Result")
                }
                awaitComplete()
            }
    }

}