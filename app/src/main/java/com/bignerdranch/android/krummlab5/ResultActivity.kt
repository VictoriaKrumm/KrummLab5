package com.bignerdranch.android.krummlab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result: TextView = findViewById(R.id.result_text)//текстВью для вывода результата
        val inputValue:Int = intent.getIntExtra("editText",0)//Получение значений из интента
        val selectedB:Int = intent.getIntExtra("convert",0)
        var price: Float = (inputValue*selectedB).toFloat()//расчёт цены с учётом скидки
        result.text = price.toString()//вывод цены

    }
}