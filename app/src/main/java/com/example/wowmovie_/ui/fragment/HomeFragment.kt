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


class HomeFragment : Fragment(R.layout.fragment_home) {
    lateinit var myadapter: ViewPagerAdapter
    lateinit var title:ArrayList<String>
    lateinit var list:ArrayList<Fragment>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }
    private fun initViews(view: View) {
        loadFragments()
        val viewPager =view. findViewById<ViewPager>(R.id.vp_list)
        val tabLayout = view.findViewById<TabLayout>(R.id.tablayout_1)
        tabLayout.setupWithViewPager(viewPager)
        myadapter=ViewPagerAdapter(list,title,requireActivity(). supportFragmentManager)
        viewPager.adapter = myadapter
    }


    private fun loadFragments() {
        list=ArrayList()
        title=ArrayList()
        list.add(HomeFragmentMyMovie())
        title.add("Moë кино")
        list.add(HomeMovieFragment())
        title.add("Фильмы")
        list.add(HomeMultikiFragment())
        title.add("Мультфильмы")
        list.add(HomeSerialFragment())
        title.add("Сериалы")

    }
}