package com.example.petcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PembayaranBerhasilActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran_berhasil)

        val btnPembayaranberhasil: Button = findViewById(R.id.btn_chatdokter)
        btnPembayaranberhasil.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_chatdokter -> {
                val intent = Intent(this@PembayaranBerhasilActivity, ChatActivity::class.java)
                startActivity(intent)
            }
        }
    }
}