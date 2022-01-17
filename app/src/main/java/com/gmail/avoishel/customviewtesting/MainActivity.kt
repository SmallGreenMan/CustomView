package com.gmail.avoishel.customviewtesting

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gmail.avoishel.customviewtesting.UI.CustomView_Clock
import com.gmail.avoishel.customviewtesting.UI.CustomView_SurfaseView
import com.gmail.avoishel.customviewtesting.UI.CustomView_revertText
import com.gmail.avoishel.customviewtesting.UI.CustonView_face
import com.gmail.avoishel.customviewtesting.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

//    lateinit var textviewHelloWorld: CustomView_revertText
//    private lateinit var binding: CustomView_Clock

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(CustonView_face(this))
        //setContentView(CustomView_SurfaseView(this))
        //setContentView(CustomView_Clock(this))

        //textviewHelloWorld = findViewById(R.id.helloWorldTextView)

//        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
//
//        val calendar = Calendar.getInstance()
//        binding.textView.setText(calendar[Calendar.HOUR].toString())
    }

//    fun revertTextClick(view: android.view.View) {
//        if (textviewHelloWorld.shouldRevertText == true){
//            textviewHelloWorld.setRevertText(false)
//        } else {
//            textviewHelloWorld.setRevertText(true)
//        }
//    }
}
