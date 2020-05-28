package com.jisu.intentpractice_20200527

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        goBackBtn.setOnClickListener {
//             돌아갈 때는 Intent 로 돌아가지 않는다.
//             Intent는 새로 화면을 만들어내는 효과가 있다.
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
//            firstBtn.setTextColor(Color.parseColor("#000000"))
            finish()
        }
    }
}
