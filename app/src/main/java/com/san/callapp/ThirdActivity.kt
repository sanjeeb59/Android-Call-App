package com.san.callapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity(){
    var txtString: TextView? = null
    var TAG = "Third Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Log.d(TAG, "Inside Third Activity")
        txtString = findViewById(R.id.missCallAlert)
        Log.d(TAG, "After find View By Id")
        var msg = StringBuilder("Miss call from - ")
        var b = intent.extras
        Log.d(TAG, "After Intent.extras")
        var missCallPhoneNumber = b?.getString("PhoneNumber", "911111111")
        Log.d(TAG, "After get the phone number")
        msg.append(missCallPhoneNumber)
        txtString?.setText(msg)
    }
}