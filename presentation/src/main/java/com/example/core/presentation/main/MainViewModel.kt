package com.example.core.presentation.main

import androidx.lifecycle.ViewModel
import com.example.core.core.Navigation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val navigation: Navigation.Mutable
) : ViewModel(), Navigation.Observe {
    override fun observe() = navigation.observe()

}