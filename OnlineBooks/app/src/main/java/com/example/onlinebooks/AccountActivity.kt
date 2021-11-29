package com.example.onlinebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val arrayAdapter: ArrayAdapter<*>
        val uersInfos = arrayOf("Pseudo: Jean Bon", "Email: jambon@gmail.com")
        var mListView = findViewById<ListView>(R.id.user_infos)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, uersInfos)
        mListView.adapter = arrayAdapter

        // A MODIFIER
        val backButton: Button = findViewById(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this,
                MainActivity::class.java)
            startActivity(intent)
        }
    }
}