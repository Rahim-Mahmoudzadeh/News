package ir.rahimmahmuodzadeh.news.ui.screens.home

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import ir.rahimmahmuodzadeh.news.data.model.NewsModel
import ir.rahimmahmuodzadeh.news.data.repository.getNews.GetNews
import ir.rahimmahmuodzadeh.news.utils.Resource
import okio.IOException
import retrofit2.HttpException

class HomeViewModel(private val getNews: GetNews) : ViewModel() {
    val _liveData=MutableLiveData<List<NewsModel>>()
    val liveData:LiveData<List<NewsModel>> = _liveData
    fun getNews(): LiveData<Resource<List<NewsModel>>> = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(getNews.getNews()))
        } catch (e: HttpException) {
            emit(Resource.Error(e.toString()))
        } catch (e: IOException) {
            emit(Resource.Error(e.toString()))
        }
    }
}