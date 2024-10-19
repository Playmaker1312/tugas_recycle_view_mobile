package com.example.recycleview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class DetailBuah : AppCompatActivity() {
    private lateinit var  txtDetailBuah: TextView
    private lateinit var imgDetailBuah : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.detailbuah)

        txtDetailBuah = findViewById(R.id.txtDetailBuah)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)

        val detailtext = intent.getStringExtra("judul")
        val detailimg = intent.getIntExtra("image",0)

        txtDetailBuah.setText(detailtext)
        imgDetailBuah.setImageResource(detailimg)
    }
}