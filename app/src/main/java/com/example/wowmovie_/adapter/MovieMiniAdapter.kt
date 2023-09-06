package com.example.wowmovie_.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wowmovie_.R
import com.example.wowmovie_.model.MovieMini

class MovieMiniAdapter(val list: ArrayList<MovieMini>):RecyclerView.Adapter<MovieMiniAdapter.MovieMiniViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieMiniViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_mini,parent,false)
        return MovieMiniViewHolder(view)
    }

    override fun getItemCount() = list.size



    override fun onBindViewHolder(holder: MovieMiniViewHolder, position: Int) {
        holder.apply {

        }
    }
    class MovieMiniViewHolder(view: View):RecyclerView.ViewHolder(view){

    }
}