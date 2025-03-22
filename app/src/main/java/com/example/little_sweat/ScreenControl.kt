package com.example.little_sweat

import androidx.fragment.app.Fragment

interface ScreenControl {

    fun openFragment(value: Fragment)

    fun closeFragment()

}