package org.martellina.androidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_REPLY = "org.martellina.androidstudio.extra.REPLY"

class SecondActivity : AppCompatActivity() {

    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mReply = findViewById(R.id.editText_second)
        val intent = intent
        val message: String? = intent.getStringExtra(EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.text_message)
        textView.text = message
    }

    fun returnReply(view: View) {
        val reply:String = mReply.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        finish()
    }
}