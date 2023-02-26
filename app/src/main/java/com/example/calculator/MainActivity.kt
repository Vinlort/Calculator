package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.ezylang.evalex.Expression

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
        val divideBtn = findViewById<Button>(R.id.div_button)
        val clearBtn = findViewById<Button>(R.id.clear_button)

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

        val numberStringBuilder = StringBuilder()

        oneBtn.setOnClickListener {
            numberStringBuilder.append("1")
            resultTextView.text = numberStringBuilder
        }

        twoBtn.setOnClickListener {
            numberStringBuilder.append("2")
            resultTextView.text = numberStringBuilder
        }
        threeBtn.setOnClickListener {
            numberStringBuilder.append("3")
            resultTextView.text = numberStringBuilder
        }

        fourBtn.setOnClickListener {
            numberStringBuilder.append("4")
            resultTextView.text = numberStringBuilder
        }

        fiveBtn.setOnClickListener {
            numberStringBuilder.append("5")
            resultTextView.text = numberStringBuilder
        }

        sixBtn.setOnClickListener {
            numberStringBuilder.append("6")
            resultTextView.text = numberStringBuilder
        }

        sevenBtn.setOnClickListener {
            numberStringBuilder.append("7")
            resultTextView.text = numberStringBuilder
        }

        eightBtn.setOnClickListener {
            numberStringBuilder.append("8")
            resultTextView.text = numberStringBuilder
        }

        nineBtn.setOnClickListener {
            numberStringBuilder.append("9")
            resultTextView.text = numberStringBuilder
        }

        zeroBtn.setOnClickListener {
            numberStringBuilder.append("0")
            resultTextView.text = numberStringBuilder
        }

        pointBtn.setOnClickListener {
            numberStringBuilder.append(".")
            resultTextView.text = numberStringBuilder
        }

        multiplyBtn.setOnClickListener {
            numberStringBuilder.append("*")
            resultTextView.text = numberStringBuilder
        }
        plusBtn.setOnClickListener {
            numberStringBuilder.append("+")
            resultTextView.text = numberStringBuilder
        }
        minusBtn.setOnClickListener {
            numberStringBuilder.append("-")
            resultTextView.text = numberStringBuilder
        }

        divideBtn.setOnClickListener {
            numberStringBuilder.append("/")
            resultTextView.text = numberStringBuilder
        }

        clearBtn.setOnClickListener {
            resultTextView.text = "0"
            numberStringBuilder.clear()
        }

        equalBtn.setOnClickListener {

            try {
                val stringExpression = numberStringBuilder.toString()
                val exp = Expression(stringExpression)
                val expRes = exp.evaluate().numberValue
                resultTextView.text = expRes.toString()

                numberStringBuilder.clear()
                numberStringBuilder.append(expRes.toString())

            }catch (t: Throwable){
                Toast.makeText(this@MainActivity, "Exception: $t", Toast.LENGTH_LONG).show()
            }

        }

    }

}