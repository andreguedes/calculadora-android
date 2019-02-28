package br.com.andreguedes.calculadorakotlin

/**
 * Created by andreguedes on 30/10/17.
 */
class CalculatorPresenter(private val view: CalculatorContract.CalculatorView) : CalculatorContract.CalculatorPresenter {

    override fun doSum() {
        view.setResult(Calculator.sum(view.getNumber1(), view.getNumber2()))
    }

    override fun doSubtract() {
        view.setResult(Calculator.subtract(view.getNumber1(), view.getNumber2()))
    }

    override fun doMultiply() {
        view.setResult(Calculator.multiply(view.getNumber1(), view.getNumber2()))
    }

    override fun doDivide() {
        view.setResult(Calculator.divider(view.getNumber1(), view.getNumber2()))
    }

}