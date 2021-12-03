package com.example.test_recyclerview

import Adapter.MyAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4.class)

class RecyclerviewTest {

    private int ResId = R.id.recyclerviewID;
    private RecyclerView recyclerView;


    private static final String LAST_ITEM_ID = "item: 20";


    @Rule
    public ActivityScenarioRule<recyclerviewActivity> homeActivityActivityScenarioRule2 = new ActivityScenarioRule<>(recyclerviewActivity.class);


    @Before
    public void setUpTest() {
        homeActivityActivityScenarioRule2.getScenario().onActivity(new ActivityScenario.ActivityAction<recyclerviewActivity>() {
            @Override
            public void perform(recyclerviewActivity activity) {
                recyclerView=activity.findViewById(ResId);
            }
        });
    }


    @Test
    public void recyclerView_isCorrect() {
        onView(withId(ResId)).check(matches(isDisplayed()));
    }


    @Test
    public void lastItem_NotDisplayed() {
        onView(withText(LAST_ITEM_ID)).check(doesNotExist());
    }


    @Test
    public void lastItem_IsDisplayed() {
        onView(withText(LAST_ITEM_ID)).check(matches(not(doesNotExist())));
    }


    @Test
    public void list_Scrolls() {
        onData(equalTo(LAST_ITEM_ID)).check(matches(isCompletelyDisplayed()));
    }


    @Test
    void row_Click() {




        onData(allOf())
                .inAdapterView(withId(R.id.recyclerView))
                .atPosition(15)
                .perform(click());





    }


}
