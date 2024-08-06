package com.msid.loginappuitesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule
    var activityScenario:ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java);

    @Test
    fun testUI_correctCredentials(){

        onView(withId(R.id.usernameEditText)).perform(typeText("Sid"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.passwordEditText)).perform(typeText("Sid123456"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.loginButton)).perform(click())

        onView(withId(R.id.statusTextView)).check(matches(withText("Login Successful!")))

    }

    @Test
    fun testUI_inCorrectCredentials(){

        onView(withId(R.id.usernameEditText)).perform(typeText("Sid"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.passwordEditText)).perform(typeText("Sid12345"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.loginButton)).perform(click())

        onView(withId(R.id.statusTextView)).check(matches(withText("Login Failed!")))

    }
}