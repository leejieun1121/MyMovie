package com.example.mymovie.network

import com.example.mymovie.movie.MyMovie
import retrofit2.http.GET

interface RetrofitAPI {
    @GET("mymovie/all")
    suspend fun getMyMovieList(): List<MyMovie>
}