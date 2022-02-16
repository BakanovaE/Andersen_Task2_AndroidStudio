package org.martellina.androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private val LOG_TAG = HelloWorldActivity::class.java.simpleName

class HelloWorldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        Log.d(LOG_TAG, "Hello World")

    }
}