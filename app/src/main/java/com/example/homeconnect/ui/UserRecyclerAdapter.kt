package com.example.homeconnect.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homeconnect.R
import com.example.homeconnect.data.User
import kotlinx.android.synthetic.main.item.view.*

class UserRecyclerAdapter : RecyclerView.Adapter<UserRecyclerAdapter.MyViewHolder>(){
    private var userList = emptyList<User>()


    override fun getItemCount(): Int {
        return  userList.size
    }

    class  MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val  currentItem = userList[position]
        holder.itemView.id_txt.text = currentItem.id.toString()
        holder.itemView.firstname_txt.text = currentItem.FirstName
        holder.itemView.last_name_txt.text = currentItem.LastName
        holder.itemView.age_txt.text = currentItem.Email.toString()
    }
    fun setData(user: List<User>){
        this.userList = user
        notifyDataSetChanged()
    }
}

