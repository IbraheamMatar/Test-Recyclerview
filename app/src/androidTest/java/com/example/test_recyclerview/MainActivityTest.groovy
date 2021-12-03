package com.example.test_recyclerview

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test

@LargeTest
class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void TestView_isCorrect() {
        onView(withId(R.id.recyclerviewtv)).check(matches(is(withText("Hello World!"))));
        onView(withId(R.id.recyclerviewtv)).check(matches(not(is(withText("ibram")))));
      onView(withId(R.id.recyclerviewtv)).check(matches(isDisplayed()));
       onView(withId(R.id.recyclerviewtv)).check(matches(isCompletelyDisplayed()));
    }


}
