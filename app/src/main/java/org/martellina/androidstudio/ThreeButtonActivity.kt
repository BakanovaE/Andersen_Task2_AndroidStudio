package org.martellina.androidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val BUTTON_ID = "Button ID"

class ThreeButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_button)
    }

    fun showText1(view: View) {
        val intent = Intent(this, ShowTextActivity::class.java)
        intent.putExtra(BUTTON_ID, 1)
        startActivity(intent)
    }

    fun showText2(view: View) {
        val intent = Intent(this, ShowTextActivity::class.java)
        intent.putExtra(BUTTON_ID, 2)
        startActivity(intent)
    }

    fun showText3(view: View) {
        val intent = Intent(this, ShowTextActivity::class.java)
        intent.putExtra(BUTTON_ID, 3)
        startActivity(intent)
    }
}