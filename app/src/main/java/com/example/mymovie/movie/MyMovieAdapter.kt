package com.example.mymovie.movie

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mymovie.databinding.ItemMyMovieBinding

class MyMovieAdapter : androidx.recyclerview.widget.ListAdapter<MyMovie, MyMovieAdapter.MyMovieViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyMovieViewHolder {
        return MyMovieViewHolder(ItemMyMovieBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: MyMovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MyMovieViewHolder(val binding: ItemMyMovieBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item : MyMovie){
            binding.mymovie = item
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<MyMovie>(){
        override fun areItemsTheSame(oldItem: MyMovie, newItem: MyMovie): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: MyMovie, newItem: MyMovie): Boolean {
            return oldItem.id == newItem.id
        }

    }

}

