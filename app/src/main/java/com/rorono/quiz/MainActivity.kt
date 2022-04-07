package com.rorono.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.rorono.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            if (binding.etInputName.text.toString().isEmpty()) {
                //Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
                Snackbar.make(binding.linear, "Please enter your name", Snackbar.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}