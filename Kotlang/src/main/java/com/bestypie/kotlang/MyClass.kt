package com.bestypie.kotlang

fun main() {
    // Var is used when the variable declared is going to be changed - Mutable
    // Val is used when the variable declared is final or constant - Immutable
    val money: Int;

    money = 200;

    // If else statements
//    if(money >= 100) {
//        print("You are so much Rich")
//    } else {
//        print("Wake up look for Money Alex")
//    }

    // When statements
    when (money) {
        100 -> print("You are a super man")
        125 -> print("You are a Bat man")
        200 -> print("More than a hero")
        else -> {
            print("Look for more money")
        }
    }

}