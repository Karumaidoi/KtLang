package com.bestypie.kotlang

fun main() {
    // Var is used when the variable declared is going to be changed - Mutable
    // Val is used when the variable declared is final or constant - Immutable


    val myListOfName = listOf<String>("Alex", "John", "Agnes", "Terry")


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