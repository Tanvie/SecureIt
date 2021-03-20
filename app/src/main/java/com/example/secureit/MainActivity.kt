package com.example.secureit

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    @SuppressLint("ResourceType")
    lateinit var haSpinnerFunct: Spinner
    lateinit var tvHashFunct: TextView
    lateinit var haEtTextInput: EditText
    lateinit var haButtonEncrypt: Button
    lateinit var selectedFunct: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHashFunct = findViewById(R.id.haTvHashFunct)
        haSpinnerFunct = findViewById(R.id.haSpinnerFunct)
        haEtTextInput = findViewById(R.id.haEtTextInput)
        haButtonEncrypt = findViewById(R.id.haButtonEncrypt)


        haButtonEncrypt.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                tvHashFunct.text = selectedFunct
            }
        }
        )

        val adapter = ArrayAdapter.createFromResource(
                this,
                R.array.hashingFunctions,
                android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        haSpinnerFunct.adapter = adapter
        haSpinnerFunct.onItemSelectedListener = this
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        selectedFunct = parent?.getItemAtPosition(position).toString()


    }
}
