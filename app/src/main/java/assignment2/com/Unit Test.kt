package assignment2.com

class Unit Test {
    package assignment2.com

            import androidx.test.core.app.ActivityScenario
            import androidx.test.espresso.Espresso.onView
            import androidx.test.espresso.action.ViewActions.click
            import androidx.test.espresso.assertion.ViewAssertions.matches
            import androidx.test.espresso.matcher.ViewMatchers.*
            import androidx.test.ext.junit.runners.AndroidJUnit4
            import org.junit.After
            import org.junit.Before
            import org.junit.Test
            import org.junit.runner.RunWith

            @RunWith(AndroidJUnit4::class)
            class DogActivityTest {

                private lateinit var scenario: ActivityScenario<Dog>

                @Before
                fun setup() {
                    // Launch the Dog activity before each test
                    scenario = ActivityScenario.launch(Dog::class.java)
                }

                @After
                fun tearDown() {
                    // Close the activity after each test
                    scenario.close()
                }

                @Test
                fun testFeedButton() {
                    // Click on the Feed button
                    onView(withId(R.id.Feed)).perform(click())

                    // Check if the hunger status has been updated
                    onView(withId(R.id.rhungerTextView)).check(matches(withText("80%")))
                }

                @Test
                fun testCleanButton() {
                    // Click on the Clean button
                    onView(withId(R.id.Button2)).perform(click())

                    // Check if the cleanliness status has been updated
                    onView(withId(R.id.rcleanTextView)).check(matches(withText("100%")))
                }

                @Test
                fun testPlayButton() {
                    // Click on the Play button
                    onView(withId(R.id.Play)).perform(click())

                    // Check if the play status has been updated
                    onView(withId(R.id.rhappyTextView)).check(matches(withText("10%")))
                }
            }

}