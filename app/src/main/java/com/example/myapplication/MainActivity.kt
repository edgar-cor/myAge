package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEdit = findViewById<EditText>(R.id.age_edit)
        val resultText = findViewById<TextView>(R.id.result_id)
        val buttomClick = findViewById<Button>(R.id.bottom)


        buttomClick.setOnClickListener {
            val ageString: String = ageEdit.text.toString()
            if( ageString.isNotEmpty()){
                val ageInt:Int = ageString.toInt()
                val result:Int = ageInt * 7
                resultText.text = getString(R.string.result_string, result)
            } else{
                Toast.makeText(this, R.string.type_string, Toast.LENGTH_SHORT).show()
            }
        }
    }

}