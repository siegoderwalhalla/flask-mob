package com.example.flask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flask.databinding.ItemLayoutBinding

class UsersListAdapter(
    private val baseUrl: String,
    private var list: List<UserData>
) : RecyclerView.Adapter<UsersListViewHolder>() {
    fun update(newList: List<UserData>){
        list = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersListViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context))

        return UsersListViewHolder(baseUrl, binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: UsersListViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }


}