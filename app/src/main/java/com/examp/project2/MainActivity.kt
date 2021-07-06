package com.examp.project2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.examp.project2.databinding.ActivityMainBinding
import com.jem.fliptabs.FlipTab

class MainActivity : AppCompatActivity() {
    lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        supportActionBar?.hide()

        main.loginbutton.setOnClickListener(View.OnClickListener {

        })
        main.lreg.setOnClickListener(View.OnClickListener {

            main.layoutlog.visibility = View.GONE
            main.customerReg.visibility = View.VISIBLE
            Toast.makeText(this, "click on loging reg page", Toast.LENGTH_LONG).show()

        })

        val flipTab = FlipTab(this)
        flipTab.setLeftTabText("customer")
        flipTab.setRightTabText("employ")


//Sets color for both text, background & border
        flipTab.setOverallColor(Color.BLUE)
//Sets color only bg & border
        flipTab.setHighlightColor(Color.GREEN)
//Sets color only for text
        flipTab.setTextColor(Color.GREEN)

        flipTab.setTabSelectedListener(object: FlipTab.TabSelectedListener {
            override fun onTabSelected(isLeftTab: Boolean, tabTextValue: String) {
                if (isLeftTab) {

                    main.customerReg.visibility = View.VISIBLE
                    main.empolyReg.visibility = View.GONE
                }
                else{
                    main.empolyReg.visibility = View.VISIBLE
                    main.customerReg.visibility = View.GONE

                }


            }

            override fun onTabReselected(isLeftTab: Boolean, tabTextValue: String) {


                Toast.makeText(this@MainActivity, (if (isLeftTab) "Left" else "Right") + " tab reselected", Toast.LENGTH_SHORT).show()
            }

        })

        main.loginbutton.setOnClickListener {
            startActivity( Intent(this,homepage::class.java))
        }
    }
}