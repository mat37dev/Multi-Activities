package com.example.multi_activities

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val nom = findViewById<EditText>(R.id.nom);
        val profession = findViewById<EditText>(R.id.profession);
        val societe = findViewById<EditText>(R.id.societe);
        val button = findViewById<Button>(R.id.confirmer);
        val error = findViewById<TextView>(R.id.error);
        button.setOnClickListener{
            if(nom.text.toString() != "Nom" && profession.text.toString() != "Profession" && societe.text.toString() != "Société"){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("NOM",nom.text.toString());
                intent.putExtra("PROFESSION",profession.text.toString());
                intent.putExtra("SOCIETE",societe.text.toString());
                startActivity(intent)
            }
            else{
                error.text = "Erreur vous n'avez pas rempli tous les champs!";

            }
        }
    }
}