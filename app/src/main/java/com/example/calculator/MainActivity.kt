package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultTextView = findViewById<TextView>(R.id.result)

        val pointBtn = findViewById<Button>(R.id.point_button)
        val equalBtn = findViewById<Button>(R.id.equal_button)
        val plusBtn = findViewById<Button>(R.id.plus_button)
        val minusBtn = findViewById<Button>(R.id.minus_button)
        val multiplyBtn = findViewById<Button>(R.id.mult_button)

        val zeroBtn = findViewById<Button>(R.id.zero_button)
        val oneBtn = findViewById<Button>(R.id.one_button)
        val twoBtn = findViewById<Button>(R.id.two_button)
        val threeBtn = findViewById<Button>(R.id.three_button)
        val fourBtn = findViewById<Button>(R.id.four_button)
        val fiveBtn = findViewById<Button>(R.id.five_button)
        val sixBtn = findViewById<Button>(R.id.six_button)
        val sevenBtn = findViewById<Button>(R.id.seven_button)
        val eightBtn = findViewById<Button>(R.id.eight_button)
        val nineBtn = findViewById<Button>(R.id.nine_button)


    }
}