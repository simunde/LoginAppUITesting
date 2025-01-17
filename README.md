# Created test cases for Successful and Failed Login

```
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
```

## Screenshots

<img src="images/loginScreen.png" alt="Screenshot 2" width="250"/> <img src="images/correctCredentials.png" alt="Screenshot 2" width="250"/> <img src="images/incorrectCredentials.png" alt="Screenshot 2" width="250"/> 


![Organizer Dashboard](images/LoginTest.png)
