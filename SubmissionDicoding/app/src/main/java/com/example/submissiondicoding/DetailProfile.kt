package com.example.submissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class DetailProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Profil Saya"
        }
    }
}
