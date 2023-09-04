package com.example.wowmovie_.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.wowmovie_.R
import com.example.wowmovie_.adapter.ViewPagerAdapter
import com.example.wowmovie_.ui.fragment.home.HomeFragmentMyMovie
import com.example.wowmovie_.ui.fragment.home.HomeMovieFragment
import com.example.wowmovie_.ui.fragment.home.HomeMultikiFragment
import com.example.wowmovie_.ui.fragment.home.HomeSerialFragment
import com.google.android.material.tabs.TabLayout


class MyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false)
    }



}