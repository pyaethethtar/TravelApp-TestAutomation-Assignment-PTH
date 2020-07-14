package com.example.assignment5.data.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.assignment5.data.vos.CountryVO
import com.example.assignment5.data.vos.TourVO
import com.example.assignment5.dummy.getDummyCountries
import com.example.assignment5.dummy.getDummyTours

object MockTourModelImpl : TourModel{


    override fun getAllTours(onError: (String) -> Unit): LiveData<List<TourVO>> {
        val liveDataTour = MutableLiveData<List<TourVO>>()
        liveDataTour.postValue(getDummyTours())
        return liveDataTour
    }

    override fun getAllCountries(onError: (String) -> Unit): LiveData<List<CountryVO>> {
        val liveDataCountry = MutableLiveData<List<CountryVO>>()
        liveDataCountry.postValue(getDummyCountries())
        return liveDataCountry
    }

    override fun getAllToursByName(name: String): LiveData<TourVO> {
        val liveDataTour = MutableLiveData<TourVO>()
        liveDataTour.postValue(getDummyTours().first{it.name==name})
        return liveDataTour
    }

    override fun getAllCountryByName(name: String): LiveData<CountryVO> {
        val liveDataCountry = MutableLiveData<CountryVO>()
        liveDataCountry.postValue(getDummyCountries().first{
            it.name==name
        })
        return liveDataCountry
    }
}