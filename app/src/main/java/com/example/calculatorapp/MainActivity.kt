package com.example.calculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // To Dark Mode
        val darkmode = findViewById<ImageView>(R.id.darkmode)
        darkmode.setOnClickListener {
            val intent = Intent(this, Darkmode::class.java)
            startActivity(intent)
        }

        val valuestxt = findViewById<TextView>(R.id.valuestxt)
        val calctxt1 = findViewById<TextView>(R.id.equalscal)

        // button 1
        val bt1 = findViewById<TextView>(R.id.bt1)
        bt1.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "1"
            valuestxt.text = value
        }

        // button 2
        val bt2 = findViewById<TextView>(R.id.bt2)
        bt2.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "2"
            valuestxt.text = value
        }

        // button 3
        val bt3 = findViewById<TextView>(R.id.bt3)
        bt3.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "3"
            valuestxt.text = value
        }

        // button 4
        val bt4 = findViewById<TextView>(R.id.bt4)
        bt4.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "4"
            valuestxt.text = value
        }

        // button 5
        val bt5 = findViewById<TextView>(R.id.bt5)
        bt5.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "5"
            valuestxt.text = value
        }

        // button 6
        val bt6 = findViewById<TextView>(R.id.bt6)
        bt6.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "6"
            valuestxt.text = value
        }

        // button 7
        val bt7 = findViewById<TextView>(R.id.bt7)
        bt7.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "7"
            valuestxt.text = value
        }

        // button 8
        val bt8 = findViewById<TextView>(R.id.bt8)
        bt8.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "8"
            valuestxt.text = value
        }

        // button 9
        val bt9 = findViewById<TextView>(R.id.bt9)
        bt9.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "9"
            valuestxt.text = value
        }

        // button 0
        val bt0 = findViewById<TextView>(R.id.bt0)
        bt0.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "0"
            valuestxt.text = value
        }

        // button .
        val btdot = findViewById<TextView>(R.id.btdot)
        btdot.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "."
            valuestxt.text = value
        }

        // button AC
        val btac = findViewById<TextView>(R.id.btac)
        btac.setOnClickListener {
            valuestxt.text = ""
            calctxt1.text = ""
        }

        // button plus
        val btplus = findViewById<TextView>(R.id.btplus)
        btplus.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "+"
            valuestxt.text = value
        }

        // button minus
        val btminus = findViewById<TextView>(R.id.btminus)
        btminus.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "-"
            valuestxt.text = value
        }

        // button multiply
        val btx = findViewById<ImageButton>(R.id.btmultiply)
        btx.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "x"
            valuestxt.text = value
        }

        // button divide
        val btndivide = findViewById<ImageButton>(R.id.btdivide)
        btndivide.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString() + "/"

            valuestxt.text = value
        }

        // button back
        val btnback = findViewById<ImageButton>(R.id.btclear1)
        btnback.setOnClickListener {
            val matter = valuestxt.text
            val value = matter.toString().dropLast(1)
            valuestxt.text = value
        }

        // array (Main)
        val btequals = findViewById<TextView>(R.id.btequals)
        btequals.setOnClickListener {
//            var str = valuestxt.text
//            var num1i = 0
//            var num2i = 0
//            var sumi = 0
//            val ch = Array<Char>(str.length) { ' ' }
//            for (i in 0 until str.length) {
//                ch[i] = str[i]
//            }
//
//            var firstvalue = -1
//            var num1 = "0"
//            var num2 = "0"
//            var count = 1
//            var opera1 = ""
//            var opera2 = ""
//            for (i in 0 until ch.size) {
//                if((ch[i] == '+' || ch[i] == '-' || ch[i] == 'x' || ch[i] == '/') && count  == 1) {
//                    for (j in firstvalue+1 until i) {
//                        num1 += ch[j]
//                    }
//                    firstvalue = i
//                    count += 1
//                    opera1 = ch[i].toString()
//                }
//                else if((ch[i] == '+' || ch[i] == '-' || ch[i] == 'x' || ch[i] == '/') && count >= 2){
//                    for(j in firstvalue+1 until  i){
//                        num2 += ch[j]
//                    }
//                    firstvalue = i
//                    count += 1
//                    opera2 = ch[i].toString()
//                }
//                else if(i == ch.size-1){
//                    for(j in firstvalue+1 until i+1){
//                        num2 += ch[j]
//                    }
//                    firstvalue = i
//                    count += 1
//                }
//
//                num1i = num1.toInt()
//                num2i = num2.toInt()
//                if(opera1 == "+" && count > 2){
//                    sumi = num1i + num2i
//                    opera1 = opera2
//                }
//                else if(opera1 == "-" && count > 2){
//                    sumi = num1i - num2i
//                    opera1 = opera2
//                }
//                else if(opera1 == "x" && count > 2){
//                    sumi = num1i * num2i
//                    opera1 = opera2
//                }
//                else if(opera1 == "/" && count > 2){
//                    sumi = num1i / num2i
//                    opera1 = opera2
//                }
//                else if(count == 2){
//                    sumi = num1i
//                }
//                num1 = sumi.toString()
//                num2 = "0";
//            }
//
//            calctxt1.text = sumi.toString()
            btequals.setOnClickListener {
                val expression = valuestxt.text.toString()

                try {
                    // Replace 'x' with '*' for easier processing
                    val expr = expression.replace("x", "*")

                    var result = 0.0
                    var currentNumber = ""
                    var currentOperator: Char? = null

                    for (ch in expr) {
                        if (ch.isDigit() || ch == '.') {
                            currentNumber += ch
                        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                            val num = currentNumber.toDouble()
                            currentNumber = ""

                            if (currentOperator == null) {
                                result = num
                            } else {
                                result = when (currentOperator) {
                                    '+' -> result + num
                                    '-' -> result - num
                                    '*' -> result * num
                                    '/' -> {
                                        if (num == 0.0) {
                                            calctxt1.text = "Error: Div by 0"
                                            return@setOnClickListener
                                        } else {
                                            result / num
                                        }
                                    }
                                    else -> result
                                }
                            }

                            currentOperator = ch
                        } else {
                            // invalid character
                            calctxt1.text = "Error"
                            return@setOnClickListener
                        }
                    }

                    // process last number
                    if (currentNumber.isNotEmpty()) {
                        val num = currentNumber.toDouble()
                        if (currentOperator == null) {
                            result = num
                        } else {
                            result = when (currentOperator) {
                                '+' -> result + num
                                '-' -> result - num
                                '*' -> result * num
                                '/' -> {
                                    if (num == 0.0) {
                                        calctxt1.text = "Error: Div by 0"
                                        return@setOnClickListener
                                    } else {
                                        result / num
                                    }
                                }
                                else -> result
                            }
                        }
                    }

                    calctxt1.text = if (result % 1.0 == 0.0) {
                        result.toInt().toString()
                    } else {
                        result.toString()
                    }

                } catch (e: Exception) {
                    calctxt1.text = "Error"
                }
            }

        }


        val btmenubar = findViewById<ImageView>(R.id.menubar)
        btmenubar.setOnClickListener {
            val intent = Intent(this, Darkmode::class.java)
            startActivity(intent)
        }

    }
}