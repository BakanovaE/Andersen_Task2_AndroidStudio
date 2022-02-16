package org.martellina.androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowTextActivity : AppCompatActivity() {

    private lateinit var showText: TextView
    private var extra = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_text)
        val intent = intent
        extra = intent.getIntExtra(BUTTON_ID, 0)
        showText = findViewById(R.id.showText)

        when(extra) {
            1 -> showText.text = getString(R.string.text1)
            2 -> showText.text = getString(R.string.text2)
            3 -> showText.text = getString(R.string.text3)
        }
    }
}