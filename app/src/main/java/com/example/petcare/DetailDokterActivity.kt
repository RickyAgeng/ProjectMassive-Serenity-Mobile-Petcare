package com.example.petcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailDokterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_dokter)

        val kembalilah: ImageView = findViewById(R.id.iv_backdedo)
        kembalilah.setOnClickListener {
            val fragment = HomeFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl_container, fragment)
                .addToBackStack(null)
                .commit()
        }
    }
}