package com.example.mymvvmapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders


class MyMainActivity : AppCompatActivity() {
    private lateinit var userNameView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)

        userNameView = findViewById(R.id.username)

        val myviewFactory = MyFcatory()
        val mainviewModel = ViewModelProvider(this ,myviewFactory).get(MyViewModel::class.java)
        userNameView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                userNameView.setText(mainviewModel.myanme)

            }
        })
    }
}