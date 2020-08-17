package com.example.submissiondicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCapitalCityAdapter(private val listCapital: ArrayList<CapitalCity>) : RecyclerView.Adapter<ListCapitalCityAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_capital_city, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCapital.size
    }

    //Menampilkan array di list
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val capital = listCapital[position]

        Glide.with(holder.itemView.context)
            .load(capital.foto)
            .apply(RequestOptions(). override(55, 55))
            .into(holder.imgPhoto)

        holder.nama.text   = capital.nama
        holder.detail.text = capital.detail

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listCapital[holder.adapterPosition])
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nama: TextView      = itemView.findViewById(R.id.tv_item_name)
        var detail: TextView    = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_capital_city)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: CapitalCity)
    }
}