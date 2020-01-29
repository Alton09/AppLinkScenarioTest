package com.example.applinkscenariotest

import android.content.Intent
import android.net.Uri
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class DeepLinkTest {

    @Test
    fun it_should_assert_app_link_launches_main_activity() {
        ActivityScenario.launch<MainActivity>(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://test.com")
            )
        )

        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}
