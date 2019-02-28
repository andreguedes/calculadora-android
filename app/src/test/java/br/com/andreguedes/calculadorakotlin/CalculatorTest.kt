package br.com.andreguedes.calculadorakotlin

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Created by andreguedes on 30/10/17.
 */
class CalculatorTest {

    @Test
    fun shouldReturnTrueWithCorrectSum() {
        val sum = Calculator.sum(1.0, 4.0)

        assertEquals(5.0, sum, 0.0001)
    }

    @Test
    fun shouldReturnFalseWithIncorrectSum() {
        val sum = Calculator.sum(1.0, 4.0)

        assertNotEquals(2.0, sum, 0.0001)
    }

    @Test
    fun shouldReturnTrueWithCorrectSubtract() {
        val subtract = Calculator.subtract(4.0, 2.0)

        assertEquals(2.0, subtract, 0.0001)
    }

    @Test
    fun shouldReturnFalseWithIncorrectSubtract() {
        val subtract = Calculator.subtract(4.0, 2.0)

        assertNotEquals(3.0, subtract, 0.0001)
    }

    @Test
    fun shouldReturnTrueWithCorrectMultiply() {
        val multiply = Calculator.multiply(2.0, 6.0)

        assertEquals(12.0, multiply, 0.0001)
    }

    @Test
    fun shouldReturnFalseWithIncorrectMultiply() {
        val multiply = Calculator.multiply(2.0, 6.0)

        assertNotEquals(10.0, multiply, 0.0001)
    }

    @Test
    fun shouldReturnTrueWithCorrectDivider() {
        val divider = Calculator.divider(12.0, 3.0)

        assertEquals(4.0, divider, 0.0001)
    }

    @Test
    fun shouldReturnFalseWithIncorrectDivider() {
        val divider = Calculator.divider(12.0, 3.0)

        assertNotEquals(2.0, divider, 0.0001)
    }

}