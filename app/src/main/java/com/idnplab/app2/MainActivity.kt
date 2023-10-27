package com.idnplab.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.idnplab.app2.R

class MainActivity : AppCompatActivity() {
    private var button: AppCompatButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonEnviar)
        val etMessage = findViewById<EditText>(R.id.etMensaje)

        button?.setOnClickListener {
            val mssg = etMessage.text.toString()
            val intent = Intent("com.idnpLab.app2.ACTION_SEND")
            intent.putExtra("com.idnpLab.app2.EXTRA_DATA",mssg)
            sendBroadcast(intent)
        }
    }
}