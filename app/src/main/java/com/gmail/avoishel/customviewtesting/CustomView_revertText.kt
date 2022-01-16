package com.gmail.avoishel.customviewtesting

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CustomView_revertText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defaultAttrs: Int = 0
) : AppCompatTextView(context, attrs, defaultAttrs) {
    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.CustomView_revertText, 0, 0).apply {
            try {
                val shouldRevertText = getBoolean(R.styleable.CustomView_revertText_revertText, false)
                if (shouldRevertText){
                    val revertedText = text.reversed()
                    text = revertedText
                }
            } finally {
                recycle()
            }
        }
    }
}