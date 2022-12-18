package com.example.ssumc_week5

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ssumc_week5.databinding.ItemDataBinding



class DataRVAd(private var datalist: ArrayList<Data>) : RecyclerView.Adapter<DataRVAd.DataViewHolder>() {
    
    inner class DataViewHolder(private var viewbinding: ItemDataBinding) :
        RecyclerView.ViewHolder(viewbinding.root) {

        fun bind(data: Data) {
            viewbinding.tvSb.text = data.title
            viewbinding.tvContents.text = data.contents
            viewbinding.btnDel.setOnClickListener {
                datalist.removeAt(adapterPosition)
                notifyDataSetChanged()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewbinding = ItemDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(viewbinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(datalist[position])
    }

    override fun getItemCount(): Int = datalist.size
}