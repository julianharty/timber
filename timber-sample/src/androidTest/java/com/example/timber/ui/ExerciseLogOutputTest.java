package com.example.timber.ui;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.filters.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import com.example.timber.R;
import org.junit.runner.RunWith;
import org.junit.Rule;
import org.junit.Test;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class ExerciseLogOutputTest {

  @Rule public ActivityTestRule<DemoActivity> rule = new ActivityTestRule<>(DemoActivity.class);

  @Test
  public void doNothing() throws Exception {
    DemoActivity activity = rule.getActivity();
    // Button helloButton = activity.findViewById(R.id.hello);
    onView(withId(R.id.hello)).perform(click());
    onView(withText("ddCheck logcat for a greeting!"))
      .inRoot(withDecorView(not(activity.getWindow().getDecorView())))
      .check(matches(isDisplayed()));
    Thread.sleep(3000L); 
  }
}

