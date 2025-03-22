package com.example.little_sweat

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), ScreenControl {

    private var textView: TextView? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_main)

         textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button?.setOnClickListener {
            openFragment(OneFragment())
        }

        textView?.setOnClickListener {
            textView?.text = resources.getString(R.string.yes_work)
        }
    }

    override fun onPause() {
        super.onPause()
    }
    override fun openFragment(value: Fragment) {
        this
            .supportFragmentManager
            .beginTransaction()
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .add(R.id.screenContent, value, null)
            .addToBackStack(null)
            .commitAllowingStateLoss()
    }

    override fun closeFragment() {
        TODO("Not yet implemented")
    }



}
