package com.example.wowmovie_.ui

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager
import com.example.wowmovie_.R
import com.example.wowmovie_.adapter.MediaAdapter
import com.example.wowmovie_.adapter.ViewPagerAdapter
import com.example.wowmovie_.ui.fragment.HomeFragment
import com.example.wowmovie_.ui.fragment.LoadingFragment
import com.example.wowmovie_.ui.fragment.MediaFragment
import com.example.wowmovie_.ui.fragment.MyFragment
import com.example.wowmovie_.ui.fragment.UserHomeFragment
import com.example.wowmovie_.ui.fragment.home.HomeFragmentMyMovie
import com.example.wowmovie_.ui.fragment.home.HomeMovieFragment
import com.example.wowmovie_.ui.fragment.home.HomeMultikiFragment
import com.example.wowmovie_.ui.fragment.home.HomeSerialFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import org.jetbrains.annotations.NotNull

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {

        val navHostFradgment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFradgment.navController
        val bNavMenu = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bNavMenu.setupWithNavController(navController)
        bNavMenu.setOnClickListener {

        }
    }






}