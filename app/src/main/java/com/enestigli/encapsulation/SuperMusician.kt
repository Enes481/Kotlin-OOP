package com.enestigli.encapsulation

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {

    fun Sing():String
    {
        return "SuperMusician is singing..."
    }
}