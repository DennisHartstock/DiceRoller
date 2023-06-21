package com.commcode.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val dice = Dice()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.buttonRoll)

        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val diceRoll = dice.roll()
        val diceImage = findViewById<ImageView>(R.id.imageViewDice)

        val drawableRes = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableRes)
        diceImage.contentDescription = diceRoll.toString()
    }
}