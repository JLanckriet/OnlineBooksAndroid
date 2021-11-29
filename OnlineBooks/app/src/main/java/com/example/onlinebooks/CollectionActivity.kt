package com.example.onlinebooks

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class CollectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_collection)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.account -> {
                val intent = Intent(this,
                    AccountActivity::class.java).apply {
                    putExtra("User", "Jonh Doe")
                }
                startActivity(intent)
                true
            }
            R.id.menu_library -> {
                val intent = Intent(this,
                    LibraryActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.menu_collection -> {
                val intent = Intent(this,
                    CollectionActivity::class.java)
                startActivity(intent)
                true
            }
            else -> true
        }
    }
}