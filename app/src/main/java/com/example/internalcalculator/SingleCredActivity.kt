package com.example.internalcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class SingleCredActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_cred)
        val sBtn = findViewById<Button>(R.id.sbmtBtn)
        val ip1 = findViewById<EditText>(R.id.perOne)
        val ip2 = findViewById<EditText>(R.id.perTwo)
        val ip3 = findViewById<EditText>(R.id.assignOne)
        sBtn.setOnClickListener{
            val resText = findViewById<TextView>(R.id.textView6)
            val tmp1 = ip1.text.toString().toInt()
            val tmp2 = ip2.text.toString().toInt()
            val tmp3 = ip3.text.toString().toInt()
            resText.text = (((tmp1 + tmp2) * 0.3) + tmp3).toString()
        }

        val bBtn = findViewById<Button>(R.id.backBtn)
        bBtn.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}