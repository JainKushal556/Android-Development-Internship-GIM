package com.example.day2

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculatorActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val resultScreen = findViewById<TextView>(R.id.resultScreen)
        val one = findViewById<CardView>(R.id.one)
        val two = findViewById<CardView>(R.id.two)
        val three = findViewById<CardView>(R.id.three)
        val four = findViewById<CardView>(R.id.four)
        val five = findViewById<CardView>(R.id.five)
        val six = findViewById<CardView>(R.id.six)
        val seven = findViewById<CardView>(R.id.seven)
        val eight = findViewById<CardView>(R.id.eight)
        val nine = findViewById<CardView>(R.id.nine)
        val zero = findViewById<CardView>(R.id.zero)
        val back = findViewById<CardView>(R.id.backspace)
        val ac = findViewById<CardView>(R.id.ac)
        val percentage = findViewById<CardView>(R.id.prcentage)
        val divide = findViewById<CardView>(R.id.divide)
        val multiply = findViewById<CardView>(R.id.multiply)
        val minus = findViewById<CardView>(R.id.minus)
        val plus = findViewById<CardView>(R.id.addition)
        val plusminus = findViewById<CardView>(R.id.plusminus)
        val decimal = findViewById<CardView>(R.id.decimal)
        val equalto = findViewById<CardView>(R.id.equalto)

        var resultstring = ""

        one.setOnClickListener {
            resultstring += "1"
            resultScreen.text=resultstring
        }
        two.setOnClickListener {
            resultstring += "2"
            resultScreen.text=resultstring
        }
        three.setOnClickListener {
            resultstring += "3"
            resultScreen.text=resultstring
        }
        four.setOnClickListener {
            resultstring += "4"
            resultScreen.text=resultstring
        }
        five.setOnClickListener {
            resultstring += "5"
            resultScreen.text=resultstring
        }
        six.setOnClickListener {
            resultstring += "6"
            resultScreen.text=resultstring
        }
        seven.setOnClickListener {
            resultstring += "7"
            resultScreen.text=resultstring
        }
        eight.setOnClickListener {
            resultstring += "8"
            resultScreen.text=resultstring
        }
        nine.setOnClickListener {
            resultstring += "9"
            resultScreen.text=resultstring
        }
        zero.setOnClickListener {
            resultstring += "0"
            resultScreen.text=resultstring
        }
        plus.setOnClickListener {
            resultstring += "+"
            resultScreen.text=resultstring
        }
        minus.setOnClickListener {
            resultstring += "-"
            resultScreen.text=resultstring
        }
        multiply.setOnClickListener {
            resultstring += "x"
            resultScreen.text=resultstring
        }
        divide.setOnClickListener {
            resultstring += "/"
            resultScreen.text=resultstring
        }
        decimal.setOnClickListener {
            resultstring += "."
            resultScreen.text=resultstring
        }
        plusminus.setOnClickListener {
            Toast.makeText(this, "Cooming Soon", Toast.LENGTH_SHORT).show()
        }
        equalto.setOnClickListener {
            if(!resultstring.isEmpty()){
                Toast.makeText(this, "$resultstring", Toast.LENGTH_SHORT).show()
            }
        }
        percentage.setOnClickListener {
            Toast.makeText(this, "Cooming Scoon", Toast.LENGTH_SHORT).show()
        }
        ac.setOnClickListener {
            resultstring = ""
            resultScreen.text=resultstring
        }
        back.setOnClickListener {
            resultstring = resultstring.dropLast(1)
            resultScreen.text=resultstring
        }

    }
}