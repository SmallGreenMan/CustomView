package com.gmail.avoishel.customviewtesting.UI

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.gmail.avoishel.customviewtesting.R

class CustomView_revertText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultAttrs: Int = 0,
) : AppCompatTextView(context, attrs, defaultAttrs) {

    var shouldRevertText = false

    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.CustomView_revertText, 0, 0).apply {
            try {
                shouldRevertText = getBoolean(R.styleable.CustomView_revertText_revertText, false)
                if (shouldRevertText){
                    val revertedText = text.reversed()
                    text = revertedText
                }
            } finally {
                recycle()
            }
        }
    }

    public fun setRevertText(b: Boolean){
        shouldRevertText = b
        if (shouldRevertText){
            val revertedText = text.reversed()
            text = revertedText
            //recycle()
        }
    }
}