package com.jisu.intentpractice_20200527

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        goBackBtn.setOnClickListener {

            val input01 = goBackMessageNameEdt.text.toString()
            val input02 = goBackMessageAgeEdt.text.toString()

            val inputs = listOf<String> (input01,input02)

            val goBackIntent = Intent()
            goBackIntent.putExtra("messageName",input01)
            goBackIntent.putExtra("messageAge",input02)
            //goBackIntent.putExtra("messageInputs",inputs)

            setResult(Activity.RESULT_OK, goBackIntent)

            finish()
        }

    }

}
