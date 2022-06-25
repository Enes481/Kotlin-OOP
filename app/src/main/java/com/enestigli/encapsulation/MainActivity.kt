package com.enestigli.encapsulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //encapsulation
        var james = Musician("james","Guitar",45)
        System.out.println("age: "+james.age)

        System.out.println(james.returnBandName("Enes"))
        System.out.println(james.returnBandName("eee"))

        //inheritance
        var Lars = SuperMusician("Lars","Bugle",50)
        System.out.println(Lars.Sing())
        System.out.println(Lars.age)
        System.out.println(Lars.returnBandName("E"))

        //polimorphism
        //static polimorphism

        val mathematics = Mathematics()
        var sum1 = mathematics.sum()
        var sum2 = mathematics.sum(4,5)
        var sum3 = mathematics.sum(4,4,4)

        System.out.println("sum1: "+sum1+"\n"+"sum2: "+sum2+"\n"+"sum3: "+sum3)

        //dynamic polimorphism
        val animal = Animal()
        animal.Animal()

        val dog = Dog()
        dog.Test()
        dog.Animal()

        //abstract & interface

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        var user = User("marty macfly",24)
        user.information()


        //lambda expressions
        val testString = {myString : String -> println(myString)}

        testString("My Lambda String")

        val multiplyLambda = {a: Int, b: Int -> a * b }
        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(5,5))


        //asynchrnous

        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion : (Musician) -> Unit) {
            //url -> download
            //data
            val kirkHammet = Musician("Kirk","Guitar",60)
            completion(kirkHammet)
        }

        downloadMusicians("metallica.com",{ musician ->
            println(musician.age)
        })

    }
}