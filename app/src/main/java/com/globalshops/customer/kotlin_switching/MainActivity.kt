package com.globalshops.customer.kotlin_switching

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.globalshops.customer.kotlin_switching.R
import kotlinx.android.synthetic.main.activity_main.*;
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setText("Welcome to kotlin class")
    }
}