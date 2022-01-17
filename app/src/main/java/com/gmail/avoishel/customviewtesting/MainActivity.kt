package com.gmail.avoishel.customviewtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gmail.avoishel.customviewtesting.UI.CustomView_revertText
import com.gmail.avoishel.customviewtesting.UI.CustonView_face

class MainActivity : AppCompatActivity() {

    lateinit var textviewHelloWorld: CustomView_revertText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(CustonView_face(this))

        //textviewHelloWorld = findViewById(R.id.helloWorldTextView)
    }

//    fun revertTextClick(view: android.view.View) {
//        if (textviewHelloWorld.shouldRevertText == true){
//            textviewHelloWorld.setRevertText(false)
//        } else {
//            textviewHelloWorld.setRevertText(true)
//        }
//    }
}