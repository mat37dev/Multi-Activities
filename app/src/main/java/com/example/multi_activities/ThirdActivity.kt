package com.example.multi_activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        val nom = findViewById<TextView>(R.id.nom);
        val profession = findViewById<TextView>(R.id.profession);
        val societe = findViewById<TextView>(R.id.societe);

        val intent = intent;
        nom.text = intent.getStringExtra("NOM");
        societe.text = intent.getStringExtra("SOCIETE");
        profession.text = intent.getStringExtra("PROFESSION");
    }
}