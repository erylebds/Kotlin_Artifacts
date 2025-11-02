class CodeTestingDebugging {

    fun testCats(): Boolean {
        val age = 3
        require(age > 0) { "Invalid cat age!" }
        println("Cat test passed")
        return true
    }

    fun testDogs(): List<String> {
        val barkCount = 3
        val barks = mutableListOf<String>()
        repeat(barkCount) {
            barks.add("Woof!")
        }
        println("Dog debug done")
        return barks
    }

    fun testCafe(): Int {
        val pricePerItem = 120
        val quantity = 2
        val bill = pricePerItem * quantity
        assert(bill == 240) { "Incorrect billing!" }
        println("Cafe billing test OK")
        return bill
    }

    fun testWeightlifting(): Boolean {
        val weight = 100.0
        require(weight > 0) { "Weight cannot be negative or zero!" }
        println("Weight check passed")
        return true
    }

    fun testFinance(): Int {
        val result = 5000 - 3000
        assert(result == 2000) { "Finance calculation failed!" }
        println("Finance test passed")
        return result
    }

    fun testPeppaPig(): List<String> {
        val eps = listOf("Muddy Puddles", "Picnic")
        println("Peppa episodes loaded: ${eps.size}")
        return eps
    }

    fun testShoes(): Boolean {
        val available = listOf(7, 8, 9)
        assert(8 in available) { "Size 8 should be available!" }
        println("Shoe test passed")
        return true
    }
}

fun main() {
    val tester = CodeTestingDebugging()
    tester.testCats()
    tester.testDogs()
    tester.testCafe()
    tester.testWeightlifting()
    tester.testFinance()
    tester.testPeppaPig()
    tester.testShoes()
}
