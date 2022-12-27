package com.example.texthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        val textView = findViewById<EditText>(R.id.editText)
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("text", textView.text.toString())
        startActivity(intent)
    }
}