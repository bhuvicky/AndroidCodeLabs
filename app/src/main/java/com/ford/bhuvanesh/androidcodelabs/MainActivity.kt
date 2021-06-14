package com.ford.bhuvanesh.androidcodelabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.simpleName
    private lateinit var buttonNavigation: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate")
        initializeUI()
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy")
    }

    private fun initializeUI() {
        buttonNavigation = findViewById(R.id.button_navigation)

        buttonNavigation.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
    }
}