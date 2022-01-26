package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColor
import com.example.foodapp.Adaptr.MyAdapter
import com.example.foodapp.MyShare.MySharedPrefarance
import kotlinx.android.synthetic.main.activity_list_food.*

class listFoodActivity : AppCompatActivity() {
    lateinit var myAdepter:MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)
       title="Barcha Taomlar"
        MySharedPrefarance.init(this)
        val list = MySharedPrefarance.obektString

        myAdepter= MyAdapter(this,list)
        list_Food.adapter= myAdepter

        list_Food.setOnItemClickListener { parent, view, position, id ->
           val intent = Intent(this,ShowAboutActivity::class.java)
            intent.putExtra("positions",position)
            startActivity(intent)
               }



    }
}