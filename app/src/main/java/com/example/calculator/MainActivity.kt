package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding
import com.ezylang.evalex.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val numberStringBuilder = StringBuilder()

    private  val historyList = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListeners()
    }
    private  fun setListeners()= with(binding){
        oneButton.setOnClickListener {
            numberStringBuilder.append("1")
            resultField.text = numberStringBuilder
        }

        twoButton.setOnClickListener {
            numberStringBuilder.append("2")
            resultField.text = numberStringBuilder
        }
        threeButton.setOnClickListener {
            numberStringBuilder.append("3")
            resultField.text = numberStringBuilder
        }

        fourButton.setOnClickListener {
            numberStringBuilder.append("4")
            resultField.text = numberStringBuilder
        }

        fiveButton.setOnClickListener {
            numberStringBuilder.append("5")
            resultField.text = numberStringBuilder
        }

        sixButton.setOnClickListener {
            numberStringBuilder.append("6")
            resultField.text = numberStringBuilder
        }

        sevenButton.setOnClickListener {
            numberStringBuilder.append("7")
            resultField.text = numberStringBuilder
        }

        eightButton.setOnClickListener {
            numberStringBuilder.append("8")
            resultField.text = numberStringBuilder
        }

        nineButton.setOnClickListener {
            numberStringBuilder.append("9")
            resultField.text = numberStringBuilder
        }

        zeroButton.setOnClickListener {
            numberStringBuilder.append("0")
            resultField.text = numberStringBuilder
        }

        pointButton.setOnClickListener {
            numberStringBuilder.append(".")
            resultField.text = numberStringBuilder
        }

        multiplyButton.setOnClickListener {
            numberStringBuilder.append("*")
            resultField.text = numberStringBuilder
        }
        plusButton.setOnClickListener {
            numberStringBuilder.append("+")
            resultField.text = numberStringBuilder
        }
        minusButton.setOnClickListener {
            numberStringBuilder.append("-")
            resultField.text = numberStringBuilder
        }

        divideButton.setOnClickListener {
            numberStringBuilder.append("/")
            resultField.text = numberStringBuilder
        }

        clearButton.setOnClickListener {
            resultField.text = "0"
            numberStringBuilder.clear()
        }

        clearCharButton.setOnClickListener {
            val lastIndexInString = numberStringBuilder.length-1
            if (lastIndexInString >= 0){
                numberStringBuilder.deleteCharAt(lastIndexInString)
                resultField.text = numberStringBuilder
            }
        }

        equalButton.setOnClickListener {
            calculate(resultField)
            saveToHistory()
        }

        historyButton.setOnClickListener {
            //new activity
            val intent = Intent(this@MainActivity, HistoryActivity::class.java)
            intent.putExtra("history_list", historyList.toTypedArray())
            startActivity(intent)
        }
    }

    private fun saveToHistory(){
        val stringExpression = numberStringBuilder.toString()
        historyList.add(stringExpression)
    }
    private fun calculate(resultField: TextView) {
        try {
            val stringExpression = numberStringBuilder.toString()
            val exp = Expression(stringExpression)
            val expRes = exp.evaluate().numberValue
            resultField.text = expRes.toString()

            numberStringBuilder.clear()
            numberStringBuilder.append(expRes.toString())

        } catch (t: Throwable) {
            Toast.makeText(this@MainActivity, "Error!", Toast.LENGTH_LONG).show()
        }
    }
}