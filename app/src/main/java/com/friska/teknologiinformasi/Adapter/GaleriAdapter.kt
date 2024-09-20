package com.friska.teknologiinformasi.Adapter

import android.content.Context
import android.content.Intent
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.friska.teknologiinformasi.Detail
import com.friska.teknologiinformasi.R
import com.friska.teknologiinformasi.Model.ModelGaleri

class GaleriAdapter(val context: Context, val itemList: ArrayList<ModelGaleri>):
    RecyclerView.Adapter<GaleriAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.gambar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_galeri, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, Detail::class.java)
            intent.putExtra("image_res_id", itemList[position].image)
            context.startActivity(intent)
        }
    }
}