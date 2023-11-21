package com.example.petcare

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.petcare.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottom_service -> {
                    replaceFragment(ServisFragment())
                    true
                }
                R.id.bottom_dokter -> {
                    replaceFragment(DokterFragment())
                    true
                }
                R.id.bottom_pesan -> {
                    replaceFragment(PesanFragment())
                    true
                }
                R.id.bottom_profil -> {
                    replaceFragment(ProfilFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomeFragment())

//        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
//        initUi()
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }

//    private fun initUi(){
//        binding.Toolbar.ivLogo.setOnClickListener {
//            Toast.makeText(this, "Back Button Clicked",Toast.LENGTH_SHORT).show()
//        }
//        binding.Toolbar.ivNotification.setOnClickListener {
//            Toast.makeText(this, "Notification Button Clicked",Toast.LENGTH_SHORT).show()
//        }
//        binding.Toolbar.tvTitle.text = "Hello, Jordan !"
//    }
}