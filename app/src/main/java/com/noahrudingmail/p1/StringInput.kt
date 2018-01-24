package com.noahrudingmail.p1

import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Random
import android.os.Bundle


class StringInput : AppCompatActivity() {

    private lateinit var cat:Button
    private lateinit var add:Button
    private lateinit var output:TextView
    private lateinit var tlj:Button
    private var x:Int = 0
    private var y:Int = 0
    private var random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string_input)
        initGUI()

        cat?.setOnClickListener {
            Log.d("BSU", "cat button tapped")
            val first:EditText = findViewById(R.id.editText)
            val second:EditText = findViewById(R.id.editText2)

            output.text = "${first.text } ${second.text}"
        }
        add?.setOnClickListener {
            Log.d("BSU", "add button tapped")
            val first:EditText = findViewById(R.id.editText)
            val second:EditText = findViewById(R.id.editText2)

            x = Integer.parseInt(first.getText().toString())
            y = Integer.parseInt(second.getText().toString())

            val sum: Int = x+y
            output.text = "$sum"
        }
        tlj?.setOnClickListener {
            Log.d("BSU", "tlj button tapped")
            var r: Int = rand(1, 5)
            if (r == 3) {
                output.text = "Luke dies at the end"
            } else if (r == 2) {
                output.text = "Snoke dies at the end"
            }
            else if (r == 4) {
                output.text = "Kylo Ren became W I D E Kylo"
            }else {
                output.text = "Admiral Ackbar dies at the end"

            }
        }
    }
    private fun initGUI(){
        output = findViewById(R.id.textView)
        cat = findViewById(R.id.button)
        add = findViewById(R.id.button2)
        tlj = findViewById(R.id.TLJButton)
    }

    private fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to-from)+from
    }

}
