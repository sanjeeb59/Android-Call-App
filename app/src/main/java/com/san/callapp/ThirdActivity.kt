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

        var msg = StringBuilder("Miss call from - ")
        var b = intent.extras

        var missCallPhoneNumber = b?.getString("PhoneNumber", "911111111")

        msg.append(missCallPhoneNumber)
        txtString?.setText(msg)
    }
}