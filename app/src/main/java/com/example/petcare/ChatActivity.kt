package com.example.petcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class ChatActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val btnChat: ImageView = findViewById(R.id.btn_back)
        btnChat.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_back -> {
                val intent = Intent(this@ChatActivity, PesanFragment::class.java)
                startActivity(intent)
            }
        }
    }
}