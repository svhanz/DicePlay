package com.example.diceplay

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.diceplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindigClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindigClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindigClass.root)
        bindigClass.buttonClick.setOnClickListener {
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice(){
        bindigClass.dice.setImageResource(getRandomImage())
        bindigClass.dice2.setImageResource(getRandomImage())
    }
    private fun getRandomImage(): Int {
        val randomInt = (1..6).random()
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}