package com.example.assignment5.dummy

import com.example.assignment5.data.vos.CountryVO
import com.example.assignment5.data.vos.ScoreReviewVO

fun getDummyCountries(): List<CountryVO>{

    val countryOne = CountryVO()
    countryOne.name = "Sea Flower Resort"
    countryOne.description = ""
    countryOne.location = ""
    countryOne.averageRating = 3.4
    countryOne.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    countryOne.photos = arrayListOf()

    val countryTwo = CountryVO()
    countryTwo.name = "Pullman Phuket Arcadia Naithon Beach"
    countryTwo.description = ""
    countryTwo.location = ""
    countryTwo.averageRating = 4.4
    countryTwo.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    countryTwo.photos = arrayListOf()

    val countryThree = CountryVO()
    countryThree.name = "Resort Krabi Ao Nang Beach"
    countryThree.description = ""
    countryThree.location = ""
    countryThree.averageRating = 4.5
    countryThree.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    countryThree.photos = arrayListOf()

    val countryFour = CountryVO()
    countryFour.name = "Collection O 7 Hotel Melawai"
    countryFour.description = ""
    countryFour.location = ""
    countryFour.averageRating = 3.5
    countryFour.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    countryFour.photos = arrayListOf()

    val countryFive = CountryVO()
    countryFive.name = "Capital O 534 Sriwijaya Hotel"
    countryFive.description = ""
    countryFive.location = ""
    countryFive.averageRating = 4.5
    countryFive.scoresAndReviews = arrayListOf<ScoreReviewVO>()
    countryFive.photos = arrayListOf()

    return arrayListOf(countryOne,countryTwo, countryThree, countryFour, countryFive)

}