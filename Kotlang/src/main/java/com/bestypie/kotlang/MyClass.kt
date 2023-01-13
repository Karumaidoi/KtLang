package com.bestypie.kotlang

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    // Var is used when the variable declared is going to be changed - Mutable
    // Val is used when the variable declared is final or constant - Immutable


//    calculateMath(multipleOf = 3)
    val money = calculateAge(20);
    print(money);

    // If else statements
//    if(money >= 100) {
//        print("You are so much Rich")
//    } else {
//        print("Wake up look for Money Alex")
//    }
//
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

fun calculateMath(first: Int = 100, second: Int = 1000, multipleOf: Int) {
    for(i in first..second) {
        if(i%multipleOf == 0) {
            println("This $i is divisible by 2")
        }
    }
}