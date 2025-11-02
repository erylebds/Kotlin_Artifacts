// Simplified data transformation
fun refactorCatNames() {
    val cats = listOf("whiskers", "mittens", "shadow")
    val uppercaseCats = cats.map(String::uppercase)
    println("Refactored Cat Names: $uppercaseCats")
}

// Simplified logic to compute speed averages
fun refactorDogSpeed() {
    val speeds = listOf(12.3, 14.5, 13.2)
    println("Avg Dog Speed: ${speeds.average()} km/h")
}

// Refactor repeated menu validation
fun refactorCafeOrders() {
    val orders = listOf("Espresso", "", "Latte")
    val validOrders = orders.filter(String::isNotBlank)
    println("Valid Cafe Orders: $validOrders")
}

// Refactor redundant calculations
fun refactorWorkoutVolume() {
    val exercises = listOf(100.0, 80.0, 60.0)
    val volume = exercises.sum() * 5
    println("Workout Volume: ${"%.2f".format(volume)} kg")
}

// Refactor long finance formula
fun refactorBudgetCalc() {
    val income = 12000.0
    val expenses = listOf(3000.0, 2000.0, 1500.0)
    val balance = income - expenses.sum()
    println("Remaining Balance: ₱$balance")
}

// Refactor episode timing logic
fun refactorPeppaTiming() {
    val times = listOf(5, 7, 6, 8)
    val average = times.average()
    println("Avg Peppa Episode Duration: ${"%.1f".format(average)} mins")
}

// Refactor filtering shoe data
fun refactorShoeStock() {
    val sizes = (6..12).toList()
    val available = sizes.filter { it % 2 == 0 }
    println("Even-sized shoes: $available")
}

fun main() {
    refactorCatNames()
    refactorDogSpeed()
    refactorCafeOrders()
    refactorWorkoutVolume()
    refactorBudgetCalc()
    refactorPeppaTiming()
    refactorShoeStock()
}
