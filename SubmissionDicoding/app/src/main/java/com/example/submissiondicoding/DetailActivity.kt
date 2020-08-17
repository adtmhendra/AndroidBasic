package com.example.submissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_CITY   = "name" //Memberikan key supaya data yang akan dikirimkan sesuai
        const val EXTRA_DESC   = "description"
        const val EXTRA_PHOTO  = "photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //Mengubah nama pada action bar
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Detail Kota"
        }

        //Inisiasi id tujuan dan menempatkannya pada sebuah variabel
        val image  : ImageView = findViewById(R.id.img_data_received)
        val city   : TextView  = findViewById(R.id.tv_item_name_received)
        val detail : TextView  = findViewById(R.id.tv_item_detail_received)

        //Menerima data dari MainActivity
        val images  = intent.getIntExtra(EXTRA_PHOTO, 0) //Tipe data Integer selalu di akhiri dengan nilai 0. yaitu nilai default apabila suatu saat sebuah data tidak bernilai ketika dikirimkan
        val cities  = intent.getStringExtra(EXTRA_CITY)
        val details = intent.getStringExtra(EXTRA_DESC)

        //Mengatur posisi dimana data akan ditempatkan
        city.text   = cities
        detail.text = details
        Glide.with(this)
            .load(images)
            .into(image) //Membawa data dari images dan menaruhnya ke id tujuan (image)
    }
}