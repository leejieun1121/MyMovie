package com.example.mymovie.movie

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mymovie.network.RetrofitService
import kotlinx.coroutines.launch

class MyMovieViewModel : ViewModel() {

    private val _mymovieList = MutableLiveData<List<MyMovie>>()
    val myMovieList : LiveData<List<MyMovie>>
    get() = _mymovieList

    init {
        getMyMovieList()
    }

    private fun getMyMovieList(){
        viewModelScope.launch {

            _mymovieList.value = RetrofitService.service.getMyMovieList()
        }
    }
}