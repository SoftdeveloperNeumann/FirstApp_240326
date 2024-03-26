package com.example.firstapp

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.databinding.ActivityMainBinding

// das war eine Zwischenlösung
// import kotlinx.android.synthetic.main.activity_main.* diente der direkten Nutzung von ViewElementen aus der .xml
// zugriff auf et_input war so möglich --> etInput

// Wir werden mit dem ViewBinding arbeiten. Zur Verwendung muss eine Anpassung in der Builddatei eingetragen werden

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // Variante 1
//        binding.btnSend.setOnClickListener { button : View ->
//            binding.tvOutput.text = binding.etInput.text
//            binding.etInput.text.clear()
//        }

        // Variante 2
//        binding.btnSend.setOnClickListener(this)

        // Variante 3
        // Der Listener/ Funktionsaufruf wird in der Layoutdatei zugewiesen

// Das ursprüngliche Vorgehen um mit Elementen der View zu arbeiten

//        setContentView(R.layout.activity_main)
//        val input = findViewById<EditText>(R.id.et_input)
//        val output = findViewById<TextView>(R.id.tv_output)
//        val btn = findViewById<Button>(R.id.btn_send)

    }

    override fun onClick(view: View?) {
        binding.tvOutput.text = binding.etInput.text
        binding.etInput.text.clear()
    }

    fun derClick(view: View) {
        binding.tvOutput.text = binding.etInput.text
        binding.tvOutput.append(" Hallo")
        binding.etInput.text.clear()
    }
}