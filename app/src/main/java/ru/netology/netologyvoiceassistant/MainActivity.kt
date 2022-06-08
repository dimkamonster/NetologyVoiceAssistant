package ru.netology.netologyvoiceassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val _tAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(this._tAG, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "Ivan"
        val surname = "Ivanov"
        val age = 37
        val height = 172.2

        val view: TextView = findViewById(R.id.output)
        "name: $name surname: $surname age: $age height: $height".also { view.text = it }
        Log.d(this._tAG, "end of onCreate function")
    }
}