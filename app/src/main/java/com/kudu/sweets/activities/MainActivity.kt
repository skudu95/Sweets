package com.kudu.sweets.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kudu.sweets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInstagram.setOnClickListener {
            Toast.makeText(this, "Instagram clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com")))
        }
        binding.btnFacebook.setOnClickListener {
            Toast.makeText(this, "Facebook clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")))
        }
        binding.btnTwitter.setOnClickListener {
            Toast.makeText(this, "Twitter clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com")))
        }
        //login button
        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        //register button
        binding.btnRegister.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
    }


}