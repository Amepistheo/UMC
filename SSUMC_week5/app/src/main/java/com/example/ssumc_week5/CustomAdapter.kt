package com.example.ssumc_week5
import android.annotation.SuppressLint
import android.content.Context
import android.provider.ContactsContract
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.ssumc_week5.databinding.ListviewItemBinding
/*
class CustomAdapter(private val dataList: ArrayList<ContactsContract.Contacts.Data>):RecyclerView.Adapter<CustomAdapter.DataViewHolder>() {

    private val checkboxStatus = SparseBooleanArray()

    inner class DataViewHolder(private val viewBinding: ItemDataBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: ContactsContract.Contacts.Data) {
            viewBinding.tvTitle.text= data.title
            viewBinding.tvDesc.text= data.description

            viewBinding.checkboxUser.isChecked= checkboxStatus[adapterPosition]

            viewBinding.checkboxUser.setOnClickListener{
                if (!viewBinding.checkboxUser.isChecked)
                    checkboxStatus.put(adapterPosition, false)
                else
                    checkboxStatus.put(adapterPosition, true)
                notifyItemChanged(adapterPosition)
            }

//삭제 코드 adapterposition을 통해 해당 datalist를 삭제한다
            viewBinding.Rmbutton.setOnClickListener{
                dataList.removeAt(adapterPosition)
                notifyDataSetChanged()
            }

        }
    }

    //viewholder 만들어질때 동작
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewBinding = ItemDataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DataViewHolder((viewBinding))
    }
    //데이터표시
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
    //표현할 item 의 갯수
    override fun getItemCount(): Int = dataList.size
}*/