package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var items = arrayOf("CSI-뉴욕", "CSI-라스베가스", "CSI-마이애미",
                            "Friends", "Fringe", "Lost")

        var auto = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView1)
        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        auto.setAdapter(adapter)

        var multi = findViewById<MultiAutoCompleteTextView>(
            R.id.multiAutoCompleteTextView1)
        var token = MultiAutoCompleteTextView.CommaTokenizer()
        multi.setTokenizer(token)
        multi.setAdapter(adapter)
    }
}