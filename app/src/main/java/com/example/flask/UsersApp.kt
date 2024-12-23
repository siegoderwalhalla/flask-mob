package com.example.flask

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UsersApp : Application() {
    val baseUrl = "http://192.168.31.177:5000"
    private val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(UserService::class.java)

    val repository = Repository(service)

    val mainViewModel = MainViewModel(repository)

    val listViewModel = ListViewModel(repository)
}