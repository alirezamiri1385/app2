package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etAge = findViewById<EditText>(R.id.etAge)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvOutput = findViewById<TextView>(R.id.tvOutput)

        btnSubmit.setOnClickListener {
            val entry = "نام: ${etFirstName.text}\n" +
                    "نام خانوادگی: ${etLastName.text}\n" +
                    "تلفن: ${etPhone.text}\n" +
                    "ایمیل: ${etEmail.text}\n" +
                    "سن: ${etAge.text}\n\n"

            tvOutput.append(entry)

            etFirstName.text.clear()
            etLastName.text.clear()
            etPhone.text.clear()
            etEmail.text.clear()
            etAge.text.clear()
        }
    }
}
