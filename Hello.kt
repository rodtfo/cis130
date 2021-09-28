fun main(args: Array<String>) {

    println("Hello, world!")
    println("Hello, ${args[0]}")

    val temperature = 20
    val isHot = if (temperature > 40) true else false
    //can use val isHot = temperature > 40 as well
    println(isHot)

    println()

    val isUnit = println("This is an expression")
    println(isUnit)
}
