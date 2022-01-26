package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.MyShare.MySharedPrefarance
import kotlinx.android.synthetic.main.activity_show_about.*

class ShowAboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_about)
        supportActionBar?.hide()

        MySharedPrefarance.init(this)
        val list = MySharedPrefarance.obektString
        var position1 = intent.getIntExtra("positions", 0)
        txt_name.text=list[position1].name
        txt_foodd_products.text=list[position1].ingredient
        txt_products_order.text=list[position1].ingredientorder


    }
}