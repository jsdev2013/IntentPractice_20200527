package com.jisu.intentpractice_20200527

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstBtn.setOnClickListener {
            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
        }
    }
}
