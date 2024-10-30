package com.example.core.core

import android.annotation.SuppressLint
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

interface Screen {

    fun show(fragmentManager: FragmentManager, containerId: Int)

    abstract class Replace(private val fragment: Fragment) : Screen {
        override fun show(fragmentManager: FragmentManager, containerId: Int) {
            fragmentManager
                .beginTransaction()
                .replace(containerId, fragment)
                .addToBackStack(FRAGMENT_BACKSTACK)
                .commit()
        }
    }

    companion object {
        private const val FRAGMENT_BACKSTACK = "fragmentBackstack"
    }
}