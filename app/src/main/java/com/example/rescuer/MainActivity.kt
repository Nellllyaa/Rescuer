package com.example.rescuer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username =findViewById<View>(R.id.username) as TextView;
        val password =findViewById<View>(R.id.password) as TextView;
        val login =findViewById<View>(R.id.login) as MaterialButton;




    }



}