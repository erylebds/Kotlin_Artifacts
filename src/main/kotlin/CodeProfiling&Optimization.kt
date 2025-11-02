// Cat performance simulation
fun catPurringBenchmark() {
    val start = System.nanoTime()
    var total = 0L
    repeat(1_000_000) { total += it }
    val end = System.nanoTime()
    println("Cat Purr Benchmark: ${(end - start) / 1_000_000} ms")
}

// Dog optimization
fun optimizeDogRun() {
    val speeds = List(1000000) { 10 + Math.random() * 5 }
    val avg = speeds.average()
    println("Optimized Dog Run Avg: ${"%.2f".format(avg)} km/h")
}

// Café profiling
fun profileCafeBilling() {
    val start = System.currentTimeMillis()
    val total = (1..10_000).sumOf { 150 }
    println("Total café bill ₱$total")
    println("Time: ${System.currentTimeMillis() - start} ms")
}

// Workout optimization
fun optimizeWorkoutVolume() {
    val sets = (1..5).map { it * 60.0 }
    val optimized = sets.sum() * 0.95
    println("Optimized volume: $optimized kg")
}

// Finance profiling
fun profileFinanceTransactions() {
    val start = System.nanoTime()
    var balance = 10000.0
    repeat(500_000) { balance += (Math.random() * 100 - 50) }
    val time = (System.nanoTime() - start) / 1_000_000
    println("Final Balance ₱${"%.2f".format(balance)} after $time ms")
}

// Peppa preload optimization
fun optimizePeppaLoad() {
    val eps = List(1000) { "Episode $it" }
    val result = eps.map(String::uppercase)
    println("Optimized ${result.size} Peppa Episodes Loaded!")
}

// Shoe inventory profiling
fun profileShoeInventory() {
    val stock = List(100_000) { "Shoe Model #$it" }
    val found = stock.count { it.contains("500") }
    println("Found $found models with '500'")
}

fun main() {
    catPurringBenchmark()
    optimizeDogRun()
    profileCafeBilling()
    optimizeWorkoutVolume()
    profileFinanceTransactions()
    optimizePeppaLoad()
    profileShoeInventory()
}
