package com.debbie.group7miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var registerNow : TextView = findViewById(R.id.register_now)

        registerNow.setOnClickListener{
            var r = Intent(this, RegisterActivity::class.java)

            startActivity(r)
        }
    }
}