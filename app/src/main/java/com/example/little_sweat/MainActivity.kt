package com.example.little_sweat

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_main)

        val textView: TextView = findViewById(R.id.textView)

        textView.setOnClickListener {
            textView.text = "Да, работает:)"
        }
    }
}
