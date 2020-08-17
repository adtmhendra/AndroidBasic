package com.example.submissiondicoding

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCapitalCity: RecyclerView
    private var list: ArrayList<CapitalCity> = arrayListOf()

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.menu_profile -> {
                showRecyclerProfile()
            }
        }
    }

    private fun showRecyclerProfile() {
        //Mengarahkan user ke DetailProfile
        val intent = Intent(this@MainActivity, DetailProfile::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Memberi nama pada Action Bar
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Ibukota Negara Asean"
        }

        rvCapitalCity = findViewById(R.id.rv_capital_city)
        rvCapitalCity.setHasFixedSize(true) //Recycler View melakukan optimasi ukuran lebar & tinggi secara otomatis

        list.addAll(CapitalCityData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCapitalCity.layoutManager = LinearLayoutManager(this)
        val listCapitalCityAdapter  = ListCapitalCityAdapter(list)
        rvCapitalCity.adapter       = listCapitalCityAdapter

        listCapitalCityAdapter.setOnItemClickCallback(object : ListCapitalCityAdapter.OnItemClickCallback {
            override fun onItemClicked(data: CapitalCity) {
                showSelectedCity(data)
            }
        })
    }

    private fun showSelectedCity(capital: CapitalCity) {
        Toast.makeText(this, "Anda memilih " + capital.nama, Toast.LENGTH_SHORT).show()

        //Mengirim data ke DetailActivity
        /**
          val namaVariable = Intent(this@kelasAsal, kelasTujuan::class.java)
          --data yang akan dikirim--
          startActivity(namaVariable)
         */
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra("name"       , capital.nama) //Mengirim data wajib dengan key yang sama pada DetailActivity
        intent.putExtra("description", capital.deskripsi)
        intent.putExtra("photo"      , capital.foto)
        startActivity(intent)
    }
}