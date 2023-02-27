package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val historyList = intent.getStringArrayExtra("history_list") ?: arrayOf()
        //Log.d("HistoryActivity", "history list ${historyList[0]}")

        if (historyList.isNotEmpty()){
            val scrollView = ScrollView(this)

            val textView = TextView(this)
            val builder = StringBuilder()
            for (i in historyList.indices) {
                builder.append(historyList[i])
                builder.append("\n")
            }
            textView.text = builder.toString()
            textView.layoutParams =
                ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            textView.textSize = 26f
            scrollView.addView(textView)
            setContentView(scrollView)
        }

    }
}