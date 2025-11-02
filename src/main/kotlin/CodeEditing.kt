// Cats: string formatting and dynamic text editing
fun editCatQuotes() {
    val quotes = listOf("Feed me human", "Nap now", "Purr later")
    val formatted = quotes.joinToString("\n") { "🐾 $it!" }
    println("Cat Quote Editor:\n$formatted\n")
}

// Dogs: generating formatted training schedule
fun generateDogTrainingPlan() {
    val plan = (1..3).associateWith { "Walk & Fetch for ${it * 15} minutes" }
    println("Dog Training Plan:")
    plan.forEach { (day, act) -> println("Day $day: $act") }
    println()
}

// Café: formatting menu layout neatly
fun formatCafeMenu() {
    val menu = mapOf("Latte" to 120, "Espresso" to 100, "Mocha" to 140)
    println("Cafe Menu:")
    menu.forEach { (item, price) -> println("${item.padEnd(15)} ₱$price") }
    println()
}

// Weightlifting: editing exercise plan text
fun editWorkoutRoutine() {
    val plan = listOf("Squats 5x5", "Bench 3x8", "Deadlift 3x5")
    println("Workout Routine Editor:")
    plan.forEachIndexed { i, item -> println("${i + 1}. $item") }
    println()
}

// Finances: auto-generating expense summary
fun generateExpenseSummary() {
    val expenses = mapOf("Rent" to 15000, "Food" to 5000, "Gym" to 1000)
    val total = expenses.values.sum()
    println("Expense Summary:")
    expenses.forEach { (cat, amt) -> println("$cat: ₱$amt") }
    println("Total: ₱$total\n")
}

// Peppa Pig: episode list formatting
fun formatPeppaEpisodes() {
    val eps = listOf("Muddy Puddles", "Holiday", "Playground")
    println("Peppa Pig Episode Editor:")
    eps.forEachIndexed { i, e -> println("Ep ${i + 1}: $e") }
    println()
}

// Shoes: display inventory listing
fun generateShoeInventory() {
    val stock = listOf("Nike Air Max", "Adidas Samba", "Puma RS-X")
    println("Shoe Inventory:")
    stock.forEach { println("- $it") }
    println()
}

fun main() {
    editCatQuotes()
    generateDogTrainingPlan()
    formatCafeMenu()
    editWorkoutRoutine()
    generateExpenseSummary()
    formatPeppaEpisodes()
    generateShoeInventory()
}
