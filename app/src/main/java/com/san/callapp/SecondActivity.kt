package com.san.callapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var dialNumber: EditText
    private lateinit var call: Button
    var TAG = "Second Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "Inside Second Activity")
        dialNumber = findViewById(R.id.DialNumber)
        call = findViewById(R.id.callButton)

        call.setOnClickListener(this)
    }

     override fun onClick(v: View){
        val intent = Intent(this, MainActivity::class.java)
        val b = Bundle()
        b.putString("PhoneNumber", dialNumber.text.toString())
        intent.putExtras(b)
        startActivity(intent)
    }
}

