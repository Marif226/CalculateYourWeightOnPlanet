package com.example.calculateyourageonplanet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class UranusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uranus)

        val btnCalc = findViewById<Button>(R.id.calc_btn)
        btnCalc.setOnClickListener {
            val weightEarth = findViewById<EditText>(R.id.weight_input).text.toString().toDouble()

            //0.92 * 9,8 is the surface gravity for Uranus
            val weightPlanet = (weightEarth/9.8) * 0.92 * 9.8

            val result = findViewById<TextView>(R.id.result_weight)
            result.text = "Your weigh on Uranus is ${Math.round(weightPlanet * 10.0) / 10.0}!"
        }
    }
}