package com.example.rescuer

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val username = findViewById<View>(R.id.username) as TextView;
        val password = findViewById<View>(R.id.password) as TextView;
        val login = findViewById<View>(R.id.login) as MaterialButton;
        login.setOnClickListener(View.OnClickListener {
            login.setOnClickListener(View.OnClickListener {
                val username1 = username.text.toString()
                Toast.makeText(this@MainActivity2, "Username is$username1", Toast.LENGTH_SHORT)
                    .show()
            })
        })
    }
}