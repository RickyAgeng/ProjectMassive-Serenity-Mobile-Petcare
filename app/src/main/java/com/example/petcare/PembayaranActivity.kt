package com.example.petcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class PembayaranActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        val btnPembayaran : CardView = findViewById(R.id.btn_bayar)
        btnPembayaran.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_bayar -> {
                val intent = Intent(this@PembayaranActivity, PembayaranBerhasilActivity::class.java)
                startActivity(intent)
            }
        }
    }
}