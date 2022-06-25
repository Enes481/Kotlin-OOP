package com.enestigli.encapsulation

class Mathematics {


    fun sum()
    {
        System.out.println("Mathemmatics sum func...")
    }

    fun sum(x1:Int,x2:Int):Int
    {
        var sum = x1+x2
        return sum
    }

    fun sum(x1:Int,x2:Int,x3:Int):Int
    {
        var sum = x1+x2+x3
        return sum
    }

}