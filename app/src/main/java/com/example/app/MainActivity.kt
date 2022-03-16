package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myBtn:Button=findViewById(R.id.btnShow)
        myBtn.setOnClickListener { onClick() }
    }
    private fun onClick(){
        val fieldTxt:EditText=findViewById(R.id.txtInsertName)
        var name:String=fieldTxt.text.toString()
        val txtShow: TextView=findViewById(R.id.txtShow)
        txtShow.text="Bienvenido $name"
        Toast.makeText( this,"Bienvenido $name", Toast.LENGTH_SHORT).show()
    }
}