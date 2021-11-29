package com.example.onlinebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.book_description).setMovementMethod(ScrollingMovementMethod())
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