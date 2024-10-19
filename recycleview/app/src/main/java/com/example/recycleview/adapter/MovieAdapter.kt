package com.example.recycleview.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.DetailBuah
import com.example.recycleview.DetailMovie
import com.example.recycleview.MovieActivity
import com.example.recycleview.R
import com.example.recycleview.model.ModelMovie

class MovieAdapter constructor(
    private val getActivity: MovieActivity, // ini agar item recycle bisa diklik
    private val movieList: List<ModelMovie>
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardMovie: CardView = itemView.findViewById(R.id.cardMovie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false) // Pastikan layout yang benar
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity, DetailMovie::class.java)
            intent.putExtra("image", movieList[position].image)
            intent.putExtra("judul", movieList[position].title)

            getActivity.startActivity(intent)
        }

    }


}