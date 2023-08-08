package com.example.mad_practical_4_20012011082

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signupbtn=findViewById<Button>(R.id.signup)

        signupbtn.setOnClickListener {
            Intent(this@MainActivity,RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }
        val loginbtn= findViewById<Button>(R.id.loginbutton)

        loginbtn.setOnClickListener {
            Intent(this@MainActivity,LoginActivity::class.java).also {
                startActivity(it)

            }
        }
    }
}