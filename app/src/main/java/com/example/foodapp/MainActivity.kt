package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btn_foods.setOnClickListener {
            startActivity(Intent(this,listFoodActivity::class.java))
        }
        btn_add_foods.setOnClickListener {
            startActivity(Intent(this,AddFoodActivity::class.java))
        }
    }
}