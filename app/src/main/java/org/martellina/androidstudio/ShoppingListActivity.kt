package org.martellina.androidstudio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val ADD = "isAdd"

class ShoppingListActivity : AppCompatActivity() {

    private lateinit var i1: TextView
    private lateinit var i2: TextView
    private lateinit var i3: TextView
    private lateinit var i4: TextView
    private lateinit var i5: TextView
    private lateinit var i6: TextView
    private lateinit var i7: TextView
    private lateinit var i8: TextView
    private lateinit var i9: TextView
    private lateinit var i10: TextView

    lateinit var shoppingList: List<TextView>
    lateinit var mLocationShopEditText: EditText

    var isAdd = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)
        i1 = findViewById(R.id.tv1)
        i2 = findViewById(R.id.tv2)
        i3 = findViewById(R.id.tv3)
        i4 = findViewById(R.id.tv4)
        i5 = findViewById(R.id.tv5)
        i6 = findViewById(R.id.tv6)
        i7 = findViewById(R.id.tv7)
        i8 = findViewById(R.id.tv8)
        i9 = findViewById(R.id.tv9)
        i10 = findViewById(R.id.tv10)

        mLocationShopEditText = findViewById(R.id.shop_location_edittext)

        shoppingList = mutableListOf(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10)

        if (savedInstanceState != null) {
            for (i in 0..shoppingList.lastIndex) {
                shoppingList[i].text = savedInstanceState.getString("item$i")
            }
            isAdd = savedInstanceState.getBoolean(ADD)
        }

    }

    fun addItem(view: android.view.View) {
        val intent = Intent(this, ProductActivity::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    for (i in 0..shoppingList.lastIndex) {
                        if (shoppingList[i].text == "") {
                            shoppingList[i].text = data.getStringExtra(ITEM).toString()
                            break
                        }
                    }
                }
            }
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        for (i in 0..shoppingList.lastIndex) {
            outState.putString("item$i", shoppingList[i].text.toString())
        }
        outState.putBoolean(ADD, isAdd)
    }

    fun openShopLocation(view: View) {
        val loc: String = mLocationShopEditText.text.toString()
        val addressUri: Uri = Uri.parse("geo:0,0?q=" + loc)
        val intent = Intent(Intent.ACTION_VIEW, addressUri)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("ShoppingList", "Can`t handle this intent!")
        }
    }
}