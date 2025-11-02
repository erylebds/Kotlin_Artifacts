class CodeRefactoring {

    // Simplified data transformation
    fun refactorCatNames(): List<String> {
        val cats = listOf("whiskers", "mittens", "shadow")
        val uppercaseCats = cats.map(String::uppercase)
        println("Refactored Cat Names: $uppercaseCats")
        return uppercaseCats
    }

    // Simplified logic to compute speed averages
    fun refactorDogSpeed(): Double {
        val speeds = listOf(12.3, 14.5, 13.2)
        val avg = speeds.average()
        println("Avg Dog Speed: ${"%.2f".format(avg)} km/h")
        return avg
    }

    // Refactor repeated menu validation
    fun refactorCafeOrders(): List<String> {
        val orders = listOf("Espresso", "", "Latte")
        val validOrders = orders.filter(String::isNotBlank)
        println("Valid Cafe Orders: $validOrders")
        return validOrders
    }

    // Refactor redundant calculations
    fun refactorWorkoutVolume(): Double {
        val exercises = listOf(100.0, 80.0, 60.0)
        val volume = exercises.sum() * 5
        println("Workout Volume: ${"%.2f".format(volume)} kg")
        return volume
    }

    // Refactor long finance formula
    fun refactorBudgetCalc(): Double {
        val income = 12000.0
        val expenses = listOf(3000.0, 2000.0, 1500.0)
        val balance = income - expenses.sum()
        println("Remaining Balance: ₱$balance")
        return balance
    }

    // Refactor episode timing logic
    fun refactorPeppaTiming(): Double {
        val times = listOf(5, 7, 6, 8)
        val average = times.average()
        println("Avg Peppa Episode Duration: ${"%.1f".format(average)} mins")
        return average
    }

    // Refactor filtering shoe data
    fun refactorShoeStock(): List<Int> {
        val sizes = (6..12).toList()
        val available = sizes.filter { it % 2 == 0 }
        println("Even-sized shoes: $available")
        return available
    }
}

fun main() {
    val ref = CodeRefactoring()
    ref.refactorCatNames()
    ref.refactorDogSpeed()
    ref.refactorCafeOrders()
    ref.refactorWorkoutVolume()
    ref.refactorBudgetCalc()
    ref.refactorPeppaTiming()
    ref.refactorShoeStock()
}
