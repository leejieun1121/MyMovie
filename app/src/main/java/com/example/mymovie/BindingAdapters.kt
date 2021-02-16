package com.example.mymovie

import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mymovie.movie.MyMovie
import com.example.mymovie.movie.MyMovieAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerview : RecyclerView, data :List<MyMovie>?) {
    val adpater = recyclerview.adapter  as MyMovieAdapter
    adpater.submitList(data)
}

@BindingAdapter("setGenre")
fun setGenre(textView : TextView, genre:String?){
    textView.text = "장르:"+genre
}

@BindingAdapter("setDate")
fun setDate(textView : TextView, date:String?){
    textView.text = date+"개봉"
}

@BindingAdapter("setTime")
fun setTime(textView : TextView, time:String?){
    textView.text = time+" 분"
}

@BindingAdapter("setContent")
fun setContent(textView : TextView, content:String?){
    textView.text = "한줄평: "+content
}


@BindingAdapter("bindImage")
fun bindImage(imageView : ImageView, imgUrl : String?){
    Glide.with(imageView.context)
        .load(imgUrl)
        .apply(
            RequestOptions()
            .placeholder(R.drawable.loading_animation)
            .error(R.drawable.ic_broken_image))
        .into(imageView)
}