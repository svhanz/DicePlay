package com.example.diceplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : androidx.appcompat.widget.AppCompatImageView
    lateinit var diceImage2: androidx.appcompat.widget.AppCompatImageView
    lateinit var bindigClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindigClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindigClass.root)
        bindigClass.buttonClick.setOnClickListener { rollDice() }

        diceImage = bindigClass.dice
        diceImage2 = bindigClass.dice2
    }
    fun rollDice(){

    }
    fun getRandomDiceImage(){
        val randomInt = (1..6).random()
        when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}