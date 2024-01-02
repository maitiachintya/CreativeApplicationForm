package com.example.creativeapplicationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.creativeapplicationform.databinding.ActivityMainBinding

class HomePage : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsbmt.setOnClickListener{

            if (binding.txtuser.text.toString().isNotEmpty()) {

                if (binding.txtuser.text.toString().isNotEmpty()) {
                    val homePage = Intent(this, InformationDetailsActivity::class.java)
                    startActivity(homePage)
                    finish()

                } else {
                    Toast.makeText(this, "Please enter something", Toast.LENGTH_LONG).show()
                }
            }

            if (binding.txtphn.text.toString().isNotEmpty()) {

                if (binding.txtphn.text.toString().isNotEmpty()) {
                    val homePage = Intent(this, InformationDetailsActivity::class.java)
                    startActivity(homePage)
                    finish()

                } else {
                    Toast.makeText(this, "Please enter something", Toast.LENGTH_LONG).show()
                }
            }

            if (binding.txtpassword.text.toString().isNotEmpty()) {

                if (binding.txtpassword.text.toString().isNotEmpty()) {
                    val homePage = Intent(this, InformationDetailsActivity::class.java)
                    startActivity(homePage)
                    finish()

                } else {
                    Toast.makeText(this, "Please enter something", Toast.LENGTH_LONG).show()
                }
            }

            else {
                Toast.makeText(this, "Please enter something", Toast.LENGTH_LONG).show()
            }
        }
    }
}