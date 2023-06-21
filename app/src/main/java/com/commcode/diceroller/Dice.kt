package com.commcode.diceroller

class Dice {

    fun roll(): Int {
        return (1..6).random()
    }
}