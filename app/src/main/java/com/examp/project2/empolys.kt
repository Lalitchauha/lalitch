package com.examp.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.examp.project2.databinding.ActivityEmpolysBinding

class empolys : AppCompatActivity() {

    lateinit var empoly:ActivityEmpolysBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        empoly= ActivityEmpolysBinding.inflate(layoutInflater)

        supportActionBar?.hide()
        setContentView(empoly.root)
        empoly.card.setOnClickListener {
            Toast.makeText(this,"click on card",Toast.LENGTH_LONG).show()
            startActivity(Intent(this,requestpage::class.java))

        }

    }
}