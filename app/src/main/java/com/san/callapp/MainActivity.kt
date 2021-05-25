package com.san.callapp

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    var TAG = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val format1: TextView = findViewById(R.id.textView)
        var calendar = Calendar.getInstance()
        var simpleDateFormat = SimpleDateFormat("HH:mm")
        var dateTime = simpleDateFormat.format(calendar.time)
        format1.text = dateTime.toString()

        //Call a number
        val call = findViewById<Button>(R.id.call)
        call.setOnClickListener {
            Log.d(TAG, "User clicked on Call")
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

        //View the miss call - Get the dialed number from second activity and show in third activity
        val missCall = findViewById<Button>(R.id.missCall)
        missCall.setOnClickListener{
            Log.d(TAG, "Clicked on Miss Call")

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtras(getIntent().extras!!)
            startActivity(intent)
        }

        //Implementation of Simple Fragment
        val sendSMS = findViewById<Button>(R.id.sendSMS)
        sendSMS.setOnClickListener {
            Log.d(TAG, "Clicked on sendSMS Button")
            Toast.makeText(this, "Free text for fragment implement", Toast.LENGTH_SHORT).show()
            val fragment = SendSMSFragment()
            supportFragmentManager.beginTransaction().add(R.id.fragmentSendSMS, fragment).commit()
        }
        

    }


}