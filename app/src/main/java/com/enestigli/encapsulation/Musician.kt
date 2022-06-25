package com.enestigli.encapsulation

open class Musician(name:String, instrument:String, age:Int) {

    private var instrument:String? = instrument

    var age:Int? = age
        get
        private set

    private val bandName:String = "Metallica"


    fun returnBandName(password:String):String
    {
        if(password == "Enes")
            return bandName
        else
            return "wrong password"
    }

}