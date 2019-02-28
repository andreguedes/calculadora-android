package br.com.andreguedes.calculadorakotlin

/**
 * Created by andreguedes on 30/10/17.
 */
interface CalculatorContract {

    interface CalculatorView {
        fun getNumber1(): Double
        fun getNumber2(): Double
        fun setResult(result: Double?)
    }

    interface CalculatorPresenter {
        fun doSum()
        fun doSubtract()
        fun doMultiply()
        fun doDivide()
    }

}