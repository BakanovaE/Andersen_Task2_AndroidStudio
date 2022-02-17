package org.martellina.androidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.task1_1 -> {
                val intent = Intent(this, HelloWorldActivity::class.java)
                startActivity(intent)

            }
            R.id.task1_2 -> {
                val intent = Intent(this, HelloToastActivity::class.java)
                startActivity(intent)
            }
            R.id.task1_3 -> {
                val intent = Intent(this, ScrollingTextActivity::class.java)
                startActivity(intent)
            }
            R.id.task1_4 -> {
                val intent = Intent(this, Task1_4Activity::class.java)
                startActivity(intent)
            }
            R.id.task2_1 -> {
                val intent = Intent(this, TwoActivitiesActivity::class.java)
                startActivity(intent)
            }
            R.id.task2_1_codingChallenge -> {
                val intent = Intent(this, ThreeButtonActivity::class.java)
                startActivity(intent)
            }
            R.id.task2_2_codingChallenge -> {
                val intent = Intent(this, ShoppingListActivity::class.java)
                startActivity(intent)
            }
            R.id.task2_2_homework -> {
                val intent = Intent(this, CounterActivity::class.java)
                startActivity(intent)
            }
            R.id.task2_3 -> {
                val intent = Intent(this, ImplicitIntentsActivity::class.java)
                startActivity(intent)
            }
            R.id.task2_3_receiver -> {
                val intent = Intent(this, ReceiverActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}