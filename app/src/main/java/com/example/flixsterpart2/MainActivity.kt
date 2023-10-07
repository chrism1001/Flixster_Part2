package com.example.flixsterpart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private const val API_KEY = "abe398e8fe2ce2cf7bd6fa715eb62aff"
private const val ARTICLE_SEARCH_URL = "https://api.themoviedb.org/3/movie/popular"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, MovieFragment(), null).commit()
    }
}