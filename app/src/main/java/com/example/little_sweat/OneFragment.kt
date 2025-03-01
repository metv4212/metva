package com.example.little_sweat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class OneFragment : Fragment() {

    private var ivBack: ImageView? = null
    private var button: Button? = null
    private var textView: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ivBack = view.findViewById(R.id.ivBack)
        button = view.findViewById(R.id.button)
        textView = view.findViewById(R.id.textView1)

        init()
    }

    private fun init() {
        ivBack?.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
        button?.setOnClickListener {
            textView?.visibility = View.VISIBLE
            button?.visibility = View.GONE
        }
    }
}