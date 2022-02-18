package org.martellina.androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private const val COUNTER = "count"

class CounterActivity : AppCompatActivity() {

    private lateinit var countButton: Button
    private lateinit var textView: TextView
    private var myCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        countButton = findViewById(R.id.count)
        textView = findViewById(R.id.textView2)

        if (savedInstanceState != null) {
            textView.text = savedInstanceState.getString(COUNTER)
        }
    }

    fun count(view: View) {
        myCounter++
        textView.text = myCounter.toString()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putString(COUNTER, textView.text.toString())
    }

}