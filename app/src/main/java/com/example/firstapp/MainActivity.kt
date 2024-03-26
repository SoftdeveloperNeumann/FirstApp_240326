package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// das war eine Zwischenlösung
// import kotlinx.android.synthetic.main.activity_main.* diente der direkten Nutzung von ViewElementen aus der .xml
// zugriff auf et_input war so möglich --> etInput

// Wir werden mit dem ViewBinding arbeiten. Zur Verwendung muss eine Anpassung in der Builddatei eingetragen werden

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.et_input)
        val output = findViewById<TextView>(R.id.tv_output)
        val btn = findViewById<Button>(R.id.btn_send)

    }
}