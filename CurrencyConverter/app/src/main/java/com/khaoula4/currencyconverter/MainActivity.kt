
package com.khaoula4.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.wear.tiles.material.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val convertirButton :Button = findViewById(R.id.buttona)
        val amount :TextInputEditText = findViewById(R.id.amountedit)
        val resultat:TextInputEditText=findViewById(R.id.result)
       convertirButton.setOnClickListener{
           val amount = amountEt.getText.toString().toDouble()
           val result = amount.times(10.09)
           resultat.setText(result.toString())
        }



    }


}