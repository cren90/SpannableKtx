package com.cren90.spannableKtx.sample

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cren90.spannableKtx.R
import com.cren90.spannablektx.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        textSample.setText(spannable {
            bold(italic(underline("Some bold, italic, underlined text"))) + sub(
                color(Color.RED, "red subscript")
            )
        }, TextView.BufferType.SPANNABLE)
    }

}
