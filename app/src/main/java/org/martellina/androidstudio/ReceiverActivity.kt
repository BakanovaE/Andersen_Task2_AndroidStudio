package org.martellina.androidstudio

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)
        val intent = intent
        val uri: Uri? = intent.data

        if (uri != null) {
            val uri_string = R.string.uri_label.toString() + uri.toString()
            val textView: TextView = findViewById(R.id.text_uri_message)
            textView.text = uri_string
        }
    }
}