package com.jisu.intentpractice_20200527

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstBtn.setOnClickListener {
            val myIntent = Intent(this, FirstActivity::class.java)
            firstBtn.setTextColor(Color.parseColor("#ff0000"))
            startActivity(myIntent)
        }

        secondBtn.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }

        thirdBtn.setOnClickListener {
            val content = contentEdit.text.toString()
            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra("input",content)
            startActivity(myIntent)
        }

        fourthBtn.setOnClickListener {
            val myIntent = Intent(this, FourthActivity::class.java)
            startActivityForResult(myIntent, 100)
        }
    }
}
