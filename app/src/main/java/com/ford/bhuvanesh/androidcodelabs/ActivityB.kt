package com.ford.bhuvanesh.androidcodelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class ActivityB : AppCompatActivity() {

    private val CLASS_NAME = ActivityB::class.simpleName
    private val TAG = "Log $CLASS_NAME"

    private lateinit var buttonNavigation: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

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
            finish()
        }
    }
}