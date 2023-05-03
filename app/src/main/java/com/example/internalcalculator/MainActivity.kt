package com.example.internalcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oneCred = findViewById<Button>(R.id.button2)
        oneCred.setOnClickListener{
            intent = Intent(this, SingleCredActivity::class.java)
            startActivity(intent)
        }

        val twoCred = findViewById<Button>(R.id.button3)
        twoCred.setOnClickListener{
            intent = Intent(this, TwoCredActivity::class.java)
            startActivity(intent)
        }

        val threeCred = findViewById<Button>(R.id.button4)
        threeCred.setOnClickListener{
            intent = Intent(this, ThreeCredActivity::class.java)
            startActivity(intent)
        }

        val fourCred = findViewById<Button>(R.id.button5)
        fourCred.setOnClickListener{
            intent = Intent(this, FourCredActivity::class.java)
            startActivity(intent)
        }

    }
}