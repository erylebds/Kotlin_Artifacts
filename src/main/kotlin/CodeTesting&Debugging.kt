fun testCats() {
    val age = 3
    assert(age > 0) { "Invalid cat age!" }
    println("Cat test passed")
}

fun testDogs() {
    val barkCount = 3
    repeat(barkCount) { println("Woof!") }
    println("Dog debug done")
}

fun testCafe() {
    val bill = 2 * 120
    assert(bill == 240)
    println("Cafe billing test OK")
}

fun testWeightlifting() {
    val weight = 100.0
    require(weight > 0)
    println("Weight check passed")
}

fun testFinance() {
    val result = 5000 - 3000
    assert(result == 2000.0.toInt())
    println("Finance test passed")
}

fun testPeppaPig() {
    val eps = listOf("Muddy Puddles", "Picnic")
    println("Peppa episodes loaded: ${eps.size}")
}

fun testShoes() {
    val available = listOf(7, 8, 9)
    assert(8 in available)
    println("Shoe test passed")
}

fun main() {
    testCats()
    testDogs()
    testCafe()
    testWeightlifting()
    testFinance()
    testPeppaPig()
    testShoes()
}
