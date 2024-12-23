package com.example.flask

import androidx.recyclerview.widget.RecyclerView
import com.example.flask.databinding.ActivityListBinding
import com.example.flask.databinding.ItemLayoutBinding
import com.squareup.picasso.Picasso

class UsersListViewHolder(
    private val baseUrl: String,
    private val binding: ItemLayoutBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(userData: UserData){
        binding.loginTextView.text = userData.login
        binding.passTextView.text = userData.pass
        Picasso.get().load(baseUrl + userData.imageURL).into(binding.imageView)
    }
}