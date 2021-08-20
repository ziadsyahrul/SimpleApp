package com.ziadsyahrul.simpleapp.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziadsyahrul.simpleapp.MainActivity
import com.ziadsyahrul.simpleapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        login()


    }

    fun login(){
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}