package com.example.mymovie.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mymovie.R
import com.example.mymovie.databinding.FragmentMymovieBinding

class MyMovieFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentMymovieBinding.inflate(inflater)
        val viewModel = ViewModelProvider(this).get(MyMovieViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.rvMyMovieList.adapter = MyMovieAdapter()
        return binding.root
    }


}