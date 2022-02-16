package org.martellina.androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelloActivity : AppCompatActivity() {

    private lateinit var textHello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        val intent = intent
        val extraString = intent.getStringExtra(COUNT)
        textHello = findViewById(R.id.text_hello)
        val textString = """
            |Hello!
            |$extraString
        """.trimMargin()
        textHello.text = textString

    }
}