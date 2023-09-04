package com.example.wowmovie_.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wowmovie_.model.Home

class HomeAdapter(val list: ArrayList<Home>):RecyclerView.Adapter<HomeAdapter.HomeViewsHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewsHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HomeViewsHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class HomeViewsHolder(view:View):RecyclerView.ViewHolder(view){

    }

}