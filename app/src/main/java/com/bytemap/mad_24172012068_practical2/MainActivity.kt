package com.bytemap.mad_24172012068_practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMessage("onCreate called")
        Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show()
    }
    fun showMessage(message: String) {
        Log.i(TAG, "showMessage: $message")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        showMessage("onRestart called")
        super.onRestart()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        showMessage("onResume called")
        super.onResume()
    }

    override fun onPause() {
        showMessage("onPause called")
        super.onPause()
    }

    override fun onStop() {
        showMessage("onStop called")
        super.onStop()
    }

    override fun onDestroy() {
        showMessage("onDestroy called")
        super.onDestroy()
    }
}