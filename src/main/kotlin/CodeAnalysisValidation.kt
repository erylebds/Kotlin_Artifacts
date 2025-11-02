class CodeAnalysisValidation {

    // Cat mood analysis
    fun analyzeCats(): String {
        val moods = listOf(8, 6, 9)
        val avg = moods.average()
        val result = if (avg > 7) "Happy" else "Grumpy"
        return "Cat Mood Average: $avg — $result"
    }

    // Dog data validation
    fun validateDogs(): List<Pair<String, Boolean>> {
        val dogs = listOf(Pair("Rex", 3), Pair("Rocky", -1))
        return dogs.map { Pair(it.first, it.second > 0) }
    }

    // Café order validation
    fun validateOrders(): List<String> {
        val orders = listOf("Latte", "", "Espresso", "Frappé")
        return orders.filter(String::isNotBlank)
    }

    // Workout input validation
    fun validateWorkoutInput(weight: Double, reps: Int): Boolean {
        return (weight in 1.0..500.0) && (reps in 1..50)
    }

    // Finance analysis
    fun analyzeBudget(): String {
        val income = 8000.0
        val expenses = 7200.0
        val ratio = (expenses / income) * 100
        val alert = if (ratio > 85) "Overspending Alert!" else "Within Budget"
        return "Expense Ratio: ${"%.1f".format(ratio)}% — $alert"
    }

    // Peppa content validation
    fun validatePeppaContent(): List<String> {
        val titles = listOf("Happy Birthday", "Scary Forest")
        return titles.filterNot { it.contains("Scary") }
    }

    // Shoe input validation
    fun validateShoeEntry(brand: String, size: Int): Boolean {
        return brand.isNotEmpty() && size in 5..13
    }
}

fun main() {
    val v = CodeAnalysisValidation()
    println(v.analyzeCats())
    println(v.validateDogs())
    println(v.validateOrders())
    println(v.validateWorkoutInput(100.0, 12))
    println(v.analyzeBudget())
    println(v.validatePeppaContent())
    println(v.validateShoeEntry("Nike", 10))
}