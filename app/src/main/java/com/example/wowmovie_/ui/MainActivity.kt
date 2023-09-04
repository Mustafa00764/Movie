package com.example.wowmovie_.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.wowmovie_.R
import com.example.wowmovie_.adapter.ViewPagerAdapter
import com.example.wowmovie_.ui.fragment.home.HomeFragmentMyMovie
import com.example.wowmovie_.ui.fragment.home.HomeMovieFragment
import com.example.wowmovie_.ui.fragment.home.HomeMultikiFragment
import com.example.wowmovie_.ui.fragment.home.HomeSerialFragment
import com.google.android.material.tabs.TabLayout
import org.jetbrains.annotations.NotNull

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}