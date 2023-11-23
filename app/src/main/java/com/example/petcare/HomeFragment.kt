package com.example.petcare

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        val rekomalex: ImageView = view.findViewById(R.id.iv_redoalex)

        // Set an OnClickListener for the ImageView
        rekomalex.setOnClickListener {
            // Handle the click event here, for example, navigate to another activity
            val intent = Intent(requireContext(), DetailDokterActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}