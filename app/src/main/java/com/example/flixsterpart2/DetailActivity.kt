package com.example.flixsterpart2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var mediaTitleView: TextView
    private lateinit var mediaOverviewView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        mediaImageView = findViewById(R.id.mediaImage)
        mediaTitleView = findViewById(R.id.mediaTitle)
        mediaOverviewView = findViewById(R.id.mediaOverview)

        val movie = intent.getSerializableExtra(MOVIE_EXTRA) as Movie

        mediaTitleView.text = movie.title
        mediaOverviewView.text = movie.overview

        Glide.with(this)
            .load(movie.posterPathUrl)
            .centerInside()
            .into(mediaImageView)
    }
}