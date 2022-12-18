package com.example.ssuweek5
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.ssuweek5.databinding.ListItemBinding

class CustomAdapter : RecyclerView.Adapter<Holder>() {
    var listData = mutableListOf<ListData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val data = listData.get(position)
        holder.setListData(data)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView?.context, MemoActivity::class.java)
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}

class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var idTextView = itemView.findViewById<TextView>(R.id.id_number)
    var textTitleTextView = itemView.findViewById<TextView>(R.id.text_title)
    fun setText(listData : ListData) {
        idTextView.text = "${listData.number}"
        textTitleTextView.text = listData.title
    }

    fun setListData(data: ListData) {
        idTextView.text = "${data.number}"
        textTitleTextView.text = data.title
    }

}
