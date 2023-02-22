package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        var counter = 0
        val textView = findViewById<TextView>(R.id.textView)
        val upbutton = findViewById<Button>(R.id.upgradeBtn)
        button.setOnClickListener {
            Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++;
            textView.text = counter.toString()
        }
        if (counter == 100) {
            upbutton.visibility = View.VISIBLE
            upbutton.setOnClickListener {
                button.setOnClickListener {
                    Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
                    counter += 2
                    textView.text = counter.toString()
                }
            }
            upbutton.visibility = View.INVISIBLE
        }
    }
}