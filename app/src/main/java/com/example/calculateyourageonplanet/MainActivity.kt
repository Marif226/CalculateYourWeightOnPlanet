package com.example.calculateyourageonplanet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMercury = findViewById<Button>(R.id.btn_mercury)
        btnMercury.setOnClickListener {
            val intent = Intent(this, MercuryActivity::class.java)
            startActivity(intent)
//            setContentView(R.layout.activity_mercury)
//            val btnBack = findViewById<Button>(R.id.btn_back)
        }

        val btnVenus = findViewById<Button>(R.id.btn_venus)
        btnVenus.setOnClickListener {
            val intent = Intent(this, VenusActivity::class.java)
            startActivity(intent)
        }

        val btnMars = findViewById<Button>(R.id.btn_mars)
        btnMars.setOnClickListener {
            val intent = Intent(this, MarsActivity::class.java)
            startActivity(intent)
        }

        val btnJupiter = findViewById<Button>(R.id.btn_jupiter)
        btnJupiter.setOnClickListener {
            val intent = Intent(this, JupiterActivity::class.java)
            startActivity(intent)
        }

        val btnSaturn = findViewById<Button>(R.id.btn_saturn)
        btnSaturn.setOnClickListener {
            val intent = Intent(this, SaturnActivity::class.java)
            startActivity(intent)
        }

        val btnUranus = findViewById<Button>(R.id.btn_uranus)
        btnUranus.setOnClickListener {
            val intent = Intent(this, UranusActivity::class.java)
            startActivity(intent)
        }

        val btnNeptune = findViewById<Button>(R.id.btn_neptune)
        btnNeptune.setOnClickListener {
            val intent = Intent(this, NeptuneActivity::class.java)
            startActivity(intent)
        }
    }
}