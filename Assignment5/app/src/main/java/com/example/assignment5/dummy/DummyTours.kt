package com.example.assignment5.dummy

import android.widget.ScrollView
import com.example.assignment5.data.vos.ScoreReviewVO
import com.example.assignment5.data.vos.TourVO

fun getDummyTours(): List<TourVO>{

    val tourOne=TourVO()
    tourOne.name = " Neo Hotel Mangga Dua by ASTON"
    tourOne.description = ""
    tourOne.location =""
    tourOne.averageRating = 3.0
    tourOne.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    tourOne.photos = arrayListOf()

    val tourTwo = TourVO()
    tourTwo.name = "Ibis Budget Jakarta Menteng"
    tourTwo.description = ""
    tourTwo.location =""
    tourTwo.averageRating = 2.0
    tourTwo.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    tourTwo.photos = arrayListOf()

    val tourThree = TourVO()
    tourThree.name = "Magical Townhouse near Walt Disney World "
    tourThree.description = ""
    tourThree.location =""
    tourThree.averageRating = 5.0
    tourThree.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    tourThree.photos = arrayListOf()

    val tourFour = TourVO()
    tourFour.name = "Magic Village Yards Trademark Collection by Wyndham"
    tourFour.description = ""
    tourFour.location =""
    tourFour.averageRating = 4.5
    tourFour.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    tourFour.photos = arrayListOf()

    val tourFive = TourVO()
    tourFive.name = "Golf View Vacation Homes"
    tourFive.description = ""
    tourFive.location =""
    tourFive.averageRating = 3.5
    tourFive.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    tourFive.photos = arrayListOf()

    return arrayListOf(tourOne, tourTwo, tourThree, tourFour, tourFive)

}