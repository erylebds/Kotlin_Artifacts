// Cat mood analysis
fun analyzeCats() {
    val moods = listOf(8, 6, 9)
    val avg = moods.average()
    println("Cat Mood Average: $avg — ${(if (avg > 7) "Happy" else "Grumpy")}")
}

// Dog data validation
fun validateDogs() {
    val dogs = listOf(Pair("Rex", 3), Pair("Rocky", -1))
    dogs.forEach {
        val valid = it.second > 0
        println("${it.first} valid age? $valid")
    }
}

// Café order validation
fun validateOrders() {
    val orders = listOf("Latte", "", "Espresso", "Frappé")
    val valid = orders.filter(String::isNotBlank)
    println("Valid Orders: $valid")
}

// Workout input validation
fun validateWorkoutInput(weight: Double, reps: Int) {
    val valid = (weight in 1.0..500.0) && (reps in 1..50)
    println("Workout ($weight x $reps) valid? $valid")
}

// Finance analysis
fun analyzeBudget() {
    val income = 8000.0
    val expenses = 7200.0
    val ratio = (expenses / income) * 100
    println("Expense Ratio: ${"%.1f".format(ratio)}%")
    if (ratio > 85) println("Overspending Alert!")
}

// Peppa content validation
fun validatePeppaContent() {
    val titles = listOf("Happy Birthday", "Scary Forest")
    val safe = titles.filterNot { it.contains("Scary") }
    println("Safe Episodes: $safe")
}

// Shoe input validation
fun validateShoeEntry(brand: String, size: Int) {
    val valid = brand.isNotEmpty() && size in 5..13
    println("Shoe Entry [$brand, $size]: $valid")
}

fun main() {
    analyzeCats()
    validateDogs()
    validateOrders()
    validateWorkoutInput(100.0, 12)
    analyzeBudget()
    validatePeppaContent()
    validateShoeEntry("Nike", 10)
}
