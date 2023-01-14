package com.bestypie.kotlang

import java.awt.Color
import java.awt.Label

fun main() {
    // Var is used when the variable declared is going to be changed - Mutable
    // Val is used when the variable declared is final or constant - Immutable


    val myListOfName = listOf<String>("Alex", "John", "Agnes", "Terry", "ML")
    val mutableList = mutableListOf<String>("Amos")
    mutableList.add("Mercy")

    val found = myListOfName.filter { it.startsWith("M", ignoreCase = true) && it.endsWith('L')}
    print(found);
//    mutableList[2];
    mutableList.removeAt(0);

    val set = setOf<String>("Alex", "John")
    print(set);

    val map = mapOf<String, String>("Up" to "Down", "Center" to "Top", "West" to "East")
    var map2 = mutableMapOf<String, String>();
    print(map.values);

    var emptyMap = emptyMap<String, Int>()

//    calculateMath(multipleOf = 3)
    val money = calculateAge(20);
    val add: (Int, Int) -> Int = {a,b -> a * b} // This are Lambda functions

    loopOverNames(myListOfName)


    enhancedMessage("I love dart programming") {
        add(20,20);
    }

//    sum(2,3);
    print(age(10))

    val name: (String) -> Unit = {
        print(it);
    } // Lambda that does not return anything. - Unit means Void in Kotlin


    // CLASSES
    var newCar = Car();
    val text = newCar.createModel();
    print(text);

    var truck = Truck("Bima", 23, "Old");
    print(truck.createModel());
//    // When statements
//    when (money) {
//        in 1..100 -> print("You are a super man")
//        !in 10..90 -> print("You are a Bat man")
//        200 -> print("More than a hero")
//        else -> {
//            print("Look for more money")
//        }
//    }
//
//    // For Loop
//    for (i in 1..1000000) {
//        if(i%3 == 0) {
//            println("$i is a multiple of 3")
//        }
//    }

}

fun calculate(age:Int): String = "Am happy today so happy";


fun calculateAge(age:Int): Boolean {
    return age % 2 == 0
}

val age: (Int) -> Int = {a -> a * 7}

fun calculateMath(first: Int = 100, second: Int = 1000, multipleOf: Int) {
    for(i in first..second) {
        if(i%multipleOf == 0) {
            println("This $i is divisible by 2")
        }
    }
}

val sum: (Int, Int) -> Int = {a,b -> a +b};



fun loopOverNames(listNames: List<String>) {
    for (i in listNames) {
        println(i)
    }
}

fun enhancedMessage(message: String, functionAsParameter: () -> Int) {
    print("$message ${functionAsParameter()}")
}


class Truck(name: String, year: Int, brand: String): Car(name, year, brand) {
    override fun createModel(): String {
        return "This is a truck with no Model Hooray!"
    };
};

open class Car(var name: String = "Mercedes", val year: Int = 22, val brand: String = "New") {

    init {
        if(this.name == "Mercedes") {
            println("This is a Nice Car")
        }
    }

    open fun createModel(): String  {
        return "The car name is ${this.name}, and it was deigned ${this.year} ago. It's brand ${this.brand}"
    }

}

class Button(label: String): ClickEvent {
    override fun onClick(message: String) {
        TODO("Not yet implemented")
    }
}

class Character(val name: String): ClickEvent {
    override fun onClick(message: String) {
        TODO("Not yet implemented")
    }

}

interface ClickEvent {
    fun onClick(message: String)
}

class Button2(label: String): HoverEvent {
    override fun createHover() {
        TODO("Not yet implemented")
    }
}

interface HoverEvent {
    fun createHover();
}
