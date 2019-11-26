package com.ctnphrae.menufood033

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.model.view.*

class AdapterRecycleView (var dataText:Array<String> , var imgId:Array<Int> ,var context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.model, parent, false))

    }

    override fun getItemCount(): Int {
        return dataText.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.getName.text = dataText.get(position)
        holder?.getImage.setImageResource(imgId.get(position))

    }


}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val getName = view.tv_name
    val getImage = view.imgFood
}