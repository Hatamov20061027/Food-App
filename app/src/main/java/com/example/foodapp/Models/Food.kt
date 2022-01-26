package com.example.foodapp.Models

class Food {
    var name : String ? =  null
    var ingredient:String?=null
    var ingredientorder:String?=null

    constructor(name: String?, ingredient: String?, ingredientorder: String?) {
        this.name = name
        this.ingredient = ingredient
        this.ingredientorder = ingredientorder
    }
}