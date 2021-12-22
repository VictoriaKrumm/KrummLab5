package com.bignerdranch.android.krummlab5


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.RadioButton




class MainActivity : AppCompatActivity() {
    lateinit var inp: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dollarRadioButton: RadioButton = findViewById(R.id.radio_dollar)
        val euroRadioButton: RadioButton = findViewById(R.id.radio_euro)
        val poundRadioButton: RadioButton = findViewById(R.id.radio_pound)
        inp = findViewById(R.id.editText)

        val rg: RadioGroup = findViewById(R.id.radioGroup)

        val selectedB: Int = rg.checkedRadioButtonId

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {

            val intent = Intent(this, ResultActivity::class.java)
            val inputValue:Int = inp.text.toString().toInt()

            intent.putExtra("editText",inputValue)

                if (dollarRadioButton.isChecked) {
                    intent.putExtra("convert",75)
                } else if (euroRadioButton.isChecked){
                    intent.putExtra("convert",90)
                }
                else if (poundRadioButton.isChecked){
                    intent.putExtra("convert",100)
                }
                startActivity(intent)
        }
    }




}
