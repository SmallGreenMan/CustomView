package com.gmail.avoishel.customviewtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textviewHelloWorld: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textviewHelloWorld = findViewById(R.id.helloWorldTextView)
        //textviewHelloWorld.text
    }

    fun revertTextClick(view: android.view.View) {
        //if (textviewHelloWorld.reve)
    }
}