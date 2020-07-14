package com.example.assignment5.instrumentationtests

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.assignment5.data.vos.CountryVO
import com.example.assignment5.data.vos.ScoreReviewVO
import com.example.assignment5.data.vos.TourVO
import com.example.assignment5.persistence.daos.CountryDao
import com.example.assignment5.persistence.daos.TourDao
import com.example.assignment5.persistence.db.TourDB
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class PersistenceTest {

    private lateinit var tourDao: TourDao
    private lateinit var countryDao: CountryDao
    private lateinit var db: TourDB

    @Before
    fun createDb(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, TourDB::class.java
        ).build()
        tourDao=db.tourDao()
        countryDao=db.countryDao()
    }

    @After
    fun closeDb(){
        db.close()
    }

    @Test
    fun insertIntoTourDatabase(){
        val tourOne=TourVO()
        tourOne.name = " Neo Hotel Mangga Dua by ASTON"
        tourOne.description = ""
        tourOne.location =""
        tourOne.averageRating = 3.0
        tourOne.scoresAndReviews = arrayListOf<ScoreReviewVO>()
        tourOne.photos = arrayListOf()

        tourDao.insertTour(tourOne)
        assert(tourDao.getTourByName(tourOne.name).value?.name == tourOne.name)
    }

    @Test
    fun insertIntoCountryDatabase(){
        val countryOne = CountryVO()
        countryOne.name = "Sea Flower Resort"
        countryOne.description = ""
        countryOne.location = ""
        countryOne.averageRating = 3.4
        countryOne.scoresAndReviews = arrayListOf<ScoreReviewVO>()
        countryOne.photos = arrayListOf()

        countryDao.insertCountry(countryOne)
        assert(countryDao.getCountryByName(countryOne.name).value?.name == countryOne.name)
    }
}