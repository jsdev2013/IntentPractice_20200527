package com.jisu.intentpractice_20200527

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_MESSAGE = 1000

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
            startActivityForResult(myIntent, REQ_FOR_MESSAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        
        Log.d("액티비티 복귀","결과를 가지고 돌아옴")

        if(requestCode == REQ_FOR_MESSAGE) {
            if(resultCode == Activity.RESULT_OK){
                val messageName = data?.getStringExtra("messageName")
                val messageAge = data?.getStringExtra("messageAge")
                resultNameTxt.text = messageName
                resultAgeTxt.text = messageAge
            }
        }
    }
}
