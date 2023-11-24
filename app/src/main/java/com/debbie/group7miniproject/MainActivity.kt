package com.debbie.group7miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUp: Button = findViewById(R.id.button)
        signUp.setOnClickListener{
            val intent = Intent(this, signUp::class.java)
            
            startActivity(intent)

        }
        val Reg: Button = findViewById(R.id. button_1)
        Reg.setOnClickListener{
            val i = Intent(this, Reg::class.java)

            startActivity(intent)
        }
    }
}