import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CodeProfilingOptimizationTest {
    private val profiler = CodeProfilingOptimization()

    @Test
    fun catPurringBenchmark() {
        val result = profiler.catPurringBenchmark()
        assertTrue(result.contains("Cat Purr Benchmark"))
        val time = result.filter { it.isDigit() }.toLongOrNull()
        assertNotNull(time)
    }

    @Test
    fun optimizeDogRun() {
        val result = profiler.optimizeDogRun()
        assertTrue(result.contains("Optimized Dog Run Avg"))
        val avg = Regex("[0-9]+\\.[0-9]+").find(result)?.value?.toDoubleOrNull()
        assertNotNull(avg)
        assertTrue(avg!! in 10.0..15.0)
    }

    @Test
    fun profileCafeBilling() {
        val result = profiler.profileCafeBilling()
        assertTrue(result.contains("Total café bill ₱1500000"))
        assertTrue(result.contains("Time:"))
    }

    @Test
    fun optimizeWorkoutVolume() {
        val result = profiler.optimizeWorkoutVolume()
        assertTrue(result.contains("Optimized volume"))
        val vol = Regex("[0-9]+\\.[0-9]+").find(result)?.value?.toDoubleOrNull()
        assertNotNull(vol)
        assertTrue(vol!! > 0)
    }

    @Test
    fun profileFinanceTransactions() {
        val result = profiler.profileFinanceTransactions()
        assertTrue(result.contains("Final Balance ₱"))
        assertTrue(result.contains("after"))
        val balance = Regex("[0-9]+\\.[0-9]+").find(result)?.value?.toDoubleOrNull()
        assertNotNull(balance)
    }

    @Test
    fun optimizePeppaLoad() {
        val result = profiler.optimizePeppaLoad()
        assertTrue(result.contains("Optimized 1000 Peppa Episodes Loaded"))
        assertTrue(result.contains("ms"))
    }

    @Test
    fun profileShoeInventory() {
        val result = profiler.profileShoeInventory()
        assertTrue(result.contains("Found"))
        assertTrue(result.contains("models with '500'"))
    }

}