import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.random.Random

class CodeProfilingOptimization {

    // Cat performance simulation
    fun catPurringBenchmark(): String {
        val duration = measureNanoTime {
            var total = 0L
            repeat(1_000_000) { total += it }
        } / 1_000_000
        return "Cat Purr Benchmark: ${duration} ms"
    }

    // Dog optimization
    fun optimizeDogRun(): String {
        val speeds = List(1_000_000) { 10 + Random.nextDouble(0.0, 5.0) }
        val avg = speeds.average()
        return "Optimized Dog Run Avg: ${"%.2f".format(avg)} km/h"
    }

    // Café profiling
    fun profileCafeBilling(): String {
        val time = measureTimeMillis {
            (1..10_000).sumOf { 150 }
        }
        val total = 10_000 * 150
        return "Total café bill ₱$total\nTime: ${time} ms"
    }

    // Workout optimization
    fun optimizeWorkoutVolume(): String {
        val sets = (1..5).map { it * 60.0 }
        val optimized = sets.sum() * 0.95
        return "Optimized volume: ${"%.2f".format(optimized)} kg"
    }

    // Finance profiling
    fun profileFinanceTransactions(): String {
        var balance = 10_000.0
        val time = measureNanoTime {
            repeat(500_000) { balance += Random.nextDouble(-50.0, 50.0) }
        } / 1_000_000
        return "Final Balance ₱${"%.2f".format(balance)} after ${time} ms"
    }

    // Peppa preload optimization
    fun optimizePeppaLoad(): String {
        val eps = List(1000) { "Episode $it" }
        val time = measureNanoTime {
            eps.map(String::uppercase)
        } / 1_000_000
        return "Optimized ${eps.size} Peppa Episodes Loaded in ${time} ms!"
    }

    // Shoe inventory profiling
    fun profileShoeInventory(): String {
        val stock = List(100_000) { "Shoe Model #$it" }
        val time = measureNanoTime {
            stock.count { it.contains("500") }
        } / 1_000_000
        val found = stock.count { it.contains("500") }
        return "Found $found models with '500' in ${time} ms"
    }
}

fun main() {
    val p = CodeProfilingOptimization()
    println(p.catPurringBenchmark())
    println(p.optimizeDogRun())
    println(p.profileCafeBilling())
    println(p.optimizeWorkoutVolume())
    println(p.profileFinanceTransactions())
    println(p.optimizePeppaLoad())
    println(p.profileShoeInventory())
}
