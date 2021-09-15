package com.darkbeast0106.szinek

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var layout : RelativeLayout
    lateinit var textView: TextView
    lateinit var rnd: Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        layout.setOnClickListener {
            val red = rnd.nextInt(256)
            val green = rnd.nextInt(256)
            val blue = rnd.nextInt(256)
            layout.setBackgroundColor(Color.rgb(red,green,blue))
            textView.text = "($red,$green,$blue)"
            if (red < 150 && green < 150 && blue < 150) {
                textView.setTextColor(Color.WHITE)
            } else {
                textView.setTextColor(Color.BLACK)
            }
        }
    }

    fun init() {
        layout = findViewById(R.id.layout)
        textView = findViewById(R.id.text_view)
        rnd = Random() //this.rnd = new Random();
    }
}