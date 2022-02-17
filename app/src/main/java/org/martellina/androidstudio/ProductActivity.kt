package org.martellina.androidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val ITEM = "Item"

class ProductActivity : AppCompatActivity() {

    private var item = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
    }

    fun addApples(view: View) {
        item = getString(R.string.apples)
        addToList()
    }

    fun addCheese(view: View) {
        item = getString(R.string.cheese)
        addToList()
    }

    fun addRice(view: View) {
        item = getString(R.string.rice)
        addToList()
    }

    fun addBread (view: View) {
        item = getString(R.string.bread)
        addToList()
    }

    fun addTea (view: View) {
        item = getString(R.string.tea)
        addToList()
    }

    private fun addToList() {
        val intent = Intent(this, ShoppingListActivity::class.java)
        intent.putExtra(ITEM, item)
        setResult(RESULT_OK, intent)
        finish()
    }
}