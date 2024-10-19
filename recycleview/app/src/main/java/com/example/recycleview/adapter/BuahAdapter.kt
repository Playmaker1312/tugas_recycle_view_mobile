package com.example.recycleview.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.DetailBuah
import com.example.recycleview.R
import com.example.recycleview.RecycleViewBuah
import com.example.recycleview.model.ModelBuah

class BuahAdapter (
    val itemList: ArrayList<ModelBuah>,
    private val getActivity : RecycleViewBuah

    ) : RecyclerView.Adapter<BuahAdapter.MyViewHolder>()
{
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView
        var itemText : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemText = itemView.findViewById(R.id.nama)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
                return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {

        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity, DetailBuah::class.java)
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("judul", itemList[position].judul)

            getActivity.startActivity(intent)
        }
    }

}