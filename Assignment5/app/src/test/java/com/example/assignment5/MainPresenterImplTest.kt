package com.example.assignment5

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.assignment5.data.models.MockTourModelImpl
import com.example.assignment5.data.models.TourModel
import com.example.assignment5.data.models.TourModelImpl
import com.example.assignment5.data.vos.CountryVO
import com.example.assignment5.data.vos.ScoreReviewVO
import com.example.assignment5.data.vos.TourVO
import com.example.assignment5.mvp.presenters.MainPresenterImpl
import com.example.assignment5.mvp.views.MainView
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(manifest = Config.NONE)
class MainPresenterImplTest {

    private lateinit var mPresenter : MainPresenterImpl

    @RelaxedMockK
    private lateinit var mView: MainView

    private lateinit var mTourModel: TourModel

    @Before
    fun setUpPresenter(){
        MockKAnnotations.init(this)
        TourModelImpl.initDatabase(ApplicationProvider.getApplicationContext())
        mTourModel=MockTourModelImpl

        mPresenter= MainPresenterImpl()
        mPresenter.mView=mView
        mPresenter.mTourModel=this.mTourModel
    }

    @Test
    fun onTapTourItem_navigateToDetails(){
        val tappedTourItem = TourVO()
        tappedTourItem.name= " Neo Hotel Mangga Dua by ASTON"
        tappedTourItem.description="Hotel Resort"
        tappedTourItem.location="Thailand"
        tappedTourItem.averageRating=4.5
        tappedTourItem.scoresAndReviews=arrayListOf<ScoreReviewVO>()
        tappedTourItem.photos= arrayListOf()
        mPresenter.onTapItem(tappedTourItem.name)
        verify {
            mView?.navigatetoTourDetails(tappedTourItem.name)
        }

    }

    @Test
    fun onTapCountryItem_navigateToDetails(){
        val tappedCountry = CountryVO()
        tappedCountry.name="Sea Resort"
        tappedCountry.description="Hotel Resort"
        tappedCountry.location="Bangkok"
        tappedCountry.averageRating=2.3
        tappedCountry.scoresAndReviews= arrayListOf<ScoreReviewVO>()
        tappedCountry.photos= arrayListOf()
        mPresenter.onTapItem(tappedCountry.name)
        verify {
            mView?.navigatetoTourDetails(tappedCountry.name)
        }
    }
}