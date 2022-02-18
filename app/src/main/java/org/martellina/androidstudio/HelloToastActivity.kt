package org.martellina.androidstudio

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

const val COUNT = "count"

class HelloToastActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private lateinit var mShowCount: TextView
    private lateinit var zeroButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_toast)
        mShowCount = findViewById(R.id.show_count)
        zeroButton = findViewById(R.id.button_zero)
    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
        val intent = Intent(this, HelloActivity::class.java)
        intent.putExtra(COUNT, mCount.toString())
        startActivity(intent)
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.BLACK)
        } else {
            view.setBackgroundColor(Color.RED)
        }
        zeroButton.setBackgroundColor(Color.GREEN)
    }

    fun makeZero(view: View) {
        mShowCount.text = 0.toString()
        view.setBackgroundColor(Color.DKGRAY)
    }
}