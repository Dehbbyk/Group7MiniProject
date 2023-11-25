package com.debbie.group7miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var loginBtn:TextView = findViewById(R.id.loginIn)

        loginBtn.setOnClickListener{
            var l = Intent(this, SignupActivity::class.java)
            startActivity(l)
        }
    }
}