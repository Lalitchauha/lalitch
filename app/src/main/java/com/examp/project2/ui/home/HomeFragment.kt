package com.examp.project2.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.examp.project2.R
import com.examp.project2.empolys
import com.examp.project2.homepage

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView1: TextView = root.findViewById(R.id.textview1)
        val textView2: TextView = root.findViewById(R.id.textview2)
        val textView3: TextView = root.findViewById(R.id.textview3)
        val textView4: TextView = root.findViewById(R.id.textview4)

        textView1.setOnClickListener {
            Toast.makeText(context,"iron",Toast.LENGTH_LONG).show()
            startActivity( Intent(context, empolys::class.java))
        }
        textView2.setOnClickListener {
            Toast.makeText(context,"Laundry",Toast.LENGTH_LONG).show()
            startActivity( Intent(context, empolys::class.java))
        }
        textView3.setOnClickListener {
            Toast.makeText(context,"plumber",Toast.LENGTH_LONG).show()
            startActivity( Intent(context, empolys::class.java))
        }
        textView4.setOnClickListener {
            Toast.makeText(context,"electrician",Toast.LENGTH_LONG).show()
            startActivity( Intent(context, empolys::class.java))
        }
        return root
    }
}