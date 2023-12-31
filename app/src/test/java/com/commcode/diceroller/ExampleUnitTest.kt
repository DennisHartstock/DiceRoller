package com.commcode.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generates_dice_value() {
        val dice = Dice()
        val diceValue = dice.roll()
        assertTrue("The value of dice was not between 1 an 6", diceValue in 1..6)
    }
}