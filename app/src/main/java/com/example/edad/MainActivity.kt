package com.example.edad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn:Button=findViewById(R.id.btnShow)
        myBtn.setOnClickListener { Onclick() }
    }
    private fun Onclick(){
        var message:String=""
        val fieldYears:EditText=findViewById(R.id.txtYears)
        var year: String=fieldYears.text.toString()
        var years:Int?=year.toIntOrNull()
        when (years) {
            in 0..15 -> {
                message="Infante"

            }
            in 15..18-> {
                message="Adolecente"

            }
            in 18..65 -> {
                message="Adulto"

            }
            else -> { // Opción default
                message="Adulto Mayor"
            }
        }
        Toast.makeText(this,"Usted es $message, edad:$year", Toast.LENGTH_SHORT).show()
    }
}