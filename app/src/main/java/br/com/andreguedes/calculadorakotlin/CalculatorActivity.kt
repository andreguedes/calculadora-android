package br.com.andreguedes.calculadorakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity(), CalculatorContract.CalculatorView {

    lateinit var mPresenter: CalculatorContract.CalculatorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        mPresenter = CalculatorPresenter(this)

        btn_sum.setOnClickListener { mPresenter.doSum() }
        btn_subtract.setOnClickListener { mPresenter.doSubtract() }
        btn_multiply.setOnClickListener { mPresenter.doMultiply() }
        btn_divide.setOnClickListener { mPresenter.doDivide() }
    }

    override fun getNumber1(): Double {
        return edt_number_1.text.toString().toDouble()
    }

    override fun getNumber2(): Double {
        return edt_number_2.text.toString().toDouble()
    }

    override fun setResult(result: Double?) {
        txt_result.text = result.toString()
    }

}