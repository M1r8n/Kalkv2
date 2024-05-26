package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val field = findViewById<TextView>(R.id.etShowNumber)
        var number = 0.0
        var result = 0.0
        var dot = false
        var decimal = 10
        var operator = 0
        findViewById<Button>(R.id.buAC)
            .setOnClickListener {
                result=0.0
                number=0.0
                dot = false
                decimal = 10
                field.setText("0")
                operator = 0
            }
        findViewById<Button>(R.id.buPlusMinus)
            .setOnClickListener {
              if ("-".equals(field.text.subSequence(0,1).toString())) {
                  field.text = field.text.subSequence(1, field.text.lastIndex+1).toString()
              }
                else{
                  field.text ="-".plus(field.text)
              }
               number*=-1
            }
        findViewById<Button>(R.id.bu0)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("0")
                        number *= 10
                    } else {
                        field.setText("0")
                    }
                }
                else {
                    field.text=field.text.toString().plus("0")
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu1)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("1")
                        number *= 10
                    } else {
                        field.setText("1")
                    }
                    number += 1.0
                }
                else {
                    field.text=field.text.toString().plus("1")
                    number+=1.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu2)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("2")
                        number *= 10
                    } else {
                        field.setText("2")
                    }
                    number += 2.0
                }
                else {
                    field.text=field.text.toString().plus("2")
                    number+=2.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu3)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("3")
                        number *= 10
                    } else {
                        field.setText("3")
                    }
                    number += 3.0
                }
                else {
                    field.text=field.text.toString().plus("3")
                    number+=3.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu4)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("4")
                        number *= 10
                    } else {
                        field.setText("4")
                    }
                    number += 4.0
                }
                else {
                    field.text=field.text.toString().plus("4")
                    number += 4.0 / decimal
                    decimal *= 10
                }
            }
        findViewById<Button>(R.id.bu5)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("5")
                        number *= 10
                    } else {
                        field.setText("5")
                    }
                    number += 5.0
                }
                else {
                    field.text=field.text.toString().plus("5")
                    number+=5.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu6)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("6")
                        number *= 10
                    } else {
                        field.setText("6")
                    }
                    number += 6.0
                }
                else {
                    field.text=field.text.toString().plus("6")
                    number+=6.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu7)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("7")
                        number *= 10
                    } else {
                        field.setText("7")
                    }
                    number += 7.0
                }
                else {
                    field.text=field.text.toString().plus("7")
                    number+=7.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu8)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("8")
                        number *= 10
                    } else {
                        field.setText("8")
                    }
                    number += 8.0
                }
                else {
                    field.text=field.text.toString().plus("8")
                    number+=8.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.bu9)
            .setOnClickListener {
                if (dot == false) {
                    if (number != 0.0) {
                        field.text=field.text.toString().plus("9")
                        number *= 10
                    } else {
                        field.setText("9")
                    }
                    number += 9.0
                }
                else {
                    field.text=field.text.toString().plus("9")
                    number+=9.0/decimal
                    decimal*=10
                }
            }
        findViewById<Button>(R.id.buDot)
            .setOnClickListener {
                field.text=field.text.toString().plus(".")
                    dot=true
            }
        findViewById<Button>(R.id.buSum)
            .setOnClickListener {
                if (result==0.0)
                    result=number
                else
                    result+=number
                number=0.0
                dot=false
                decimal=10
                field.setText("0")
                operator = 1
            }
        findViewById<Button>(R.id.buSub)
            .setOnClickListener {
                if (result==0.0)
                    result=number
                else {
                    when (operator) {
                        1 -> result += number
                        2 -> result -= number
                        3 -> result *= number
                        4 -> result /= number
                        else -> {}
                    }
                }
                number=0.0
                dot=false
                decimal=10
                field.setText("0")
                operator = 2
            }
        findViewById<Button>(R.id.buDiv)
            .setOnClickListener {
                if (result==0.0)
                    result=number
                else {
                    when (operator) {
                        1 -> result += number
                        2 -> result -= number
                        3 -> result *= number
                        4 -> result /= number
                        else -> {}
                    }
                }
                number=0.0
                dot=false
                decimal=10
                field.setText("0")
                operator = 4
            }
        findViewById<Button>(R.id.buMul)
            .setOnClickListener {
                if (result==0.0)
                    result=number
                else {
                    when (operator) {
                        1 -> result += number
                        2 -> result -= number
                        3 -> result *= number
                        4 -> result /= number
                        else -> {}
                    }
                }
                number=0.0
                dot=false
                decimal=10
                field.setText("0")
                operator = 3
            }
        findViewById<Button>(R.id.buEq)
            .setOnClickListener {
                if (result==0.0)
                    result=number
                else {
                    when (operator) {
                        1 -> result += number
                        2 -> result -= number
                        3 -> result *= number
                        4 -> result /= number
                        else -> {}
                    }
                }
                number=0.0
                dot=false
                decimal=10
                field.setText(result.toString())
                operator = 0
            }
        findViewById<Button>(R.id.buPer)
            .setOnClickListener {
                number/=100
                result*=number
                dot=false
                decimal*=100
                field.setText(number.toString())
                operator = 0
            }
    }

}