package com.example.assignment5.uitests

import android.content.Intent
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.android.dx.ssa.EscapeAnalysis
import com.example.assignment5.R
import com.example.assignment5.activities.MainActivity
import com.example.assignment5.view.viewholders.CountryViewHolder
import com.example.assignment5.view.viewholders.TourViewHolder
import kotlinx.android.synthetic.main.fragment_main.view.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class NavigateToDetailsTest {

    private val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Before
    open fun setUp() {
        activityTestRule.launchActivity(Intent())
    }

    @Test
    fun tapOnTourItem_navigatetoTourDetails(){
        Espresso.onView(ViewMatchers.withId(R.id.rvCountry))
            .perform(RecyclerViewActions.actionOnItemAtPosition<TourViewHolder>(0,
                    ViewActions.click()))
        Espresso.onView(ViewMatchers.withId(R.id.tvDescription))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun tapOnCountryItem_navigatetoCountryDetails(){
        Espresso.onView(ViewMatchers.withId(R.id.rvPopularTours))
            .perform(RecyclerViewActions.actionOnItemAtPosition<CountryViewHolder>(0,
                ViewActions.click()))
        Espresso.onView(ViewMatchers.withId(R.id.tvDescription))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}