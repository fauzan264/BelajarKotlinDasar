fun main() {
    var counter:Int = 0

    var lambdaIncrement: ()-> Unit = {
        println("Lambda Increment")
        counter++
    }

    var anonymousIncrement = fun() {
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}