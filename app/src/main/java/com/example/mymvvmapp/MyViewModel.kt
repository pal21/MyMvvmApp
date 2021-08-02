package com.example.mymvvmapp

import android.util.Log
import android.util.Log.INFO
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.ArrayList
import java.util.logging.Level.INFO

class MyViewModel() : ViewModel() {

     var myanme :String? = "I love Cap"
     init {
         Log.i("PAYAL", "what is my name ")
     }

}