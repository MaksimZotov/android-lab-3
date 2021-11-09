package com.maksimzotov.androidlab3

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId

private fun openAboutViaBottomNav() {
    onView(withId(R.id.bottom_navigation_view)).perform(click())
}

fun openAbout() = openAboutViaBottomNav()