package com.examp.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class requestpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_requestpage)
    }
}