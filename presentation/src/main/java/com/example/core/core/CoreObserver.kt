package com.example.core.core

import androidx.lifecycle.MutableLiveData

interface CoreObserver {

    interface Update<T: Any>{
        fun update(data: T)
    }

    interface Observe<T: Any>{
        fun observe() : MutableLiveData<T>
    }

    interface Mutable<T: Any> : Update<T>, Observe<T>

    abstract class Abstract<T: Any>() : Mutable<T> {

        private val liveData = MutableLiveData<T>()

        override fun update(data: T) {
            liveData.value = data
        }

        override fun observe() = liveData
    }
}