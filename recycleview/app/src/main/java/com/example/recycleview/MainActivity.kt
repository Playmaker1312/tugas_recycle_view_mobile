package com.example.recycleview

import android.content.Intent
import android.graphics.Movie
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout)

        val bBuah = findViewById<Button>(R.id.bBuah)
        val bMovie = findViewById<Button>(R.id.bMovie)

        bBuah.setOnClickListener(){
            val rv_buah = Intent (this, RecycleViewBuah::class.java)
            startActivity(rv_buah)
        }

        bMovie.setOnClickListener(){
            val rv_movie = Intent (this, MovieActivity::class.java)
            startActivity(rv_movie)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}