package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.Models.Food
import com.example.foodapp.MyShare.MySharedPrefarance
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)
        title = "Taom Qo'shish"

        MySharedPrefarance.init(this)
        btn_saqlash.setOnClickListener {
            val name =  TaomNoma.text.toString().trim()
            val foodProduts = edt_food_products.text.toString().trim()
            val foodProdutsorder = edt_products_orde.text.toString().trim()

            if (name != ""  &&   foodProduts!="" && foodProdutsorder!=""){
                val list = MySharedPrefarance.obektString
                list.add(Food(name,foodProduts,foodProdutsorder))
                MySharedPrefarance.obektString=list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "Ma'lumot yetarli emas", Toast.LENGTH_SHORT).show()
            }

        }
    }
}