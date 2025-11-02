import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CodeRefactoringTest {
    private val ref = CodeRefactoring()

    @Test
    fun refactorCatNames() {
        val cats = ref.refactorCatNames()
        assertEquals(listOf("WHISKERS", "MITTENS", "SHADOW"), cats)
    }

    @Test
    fun refactorDogSpeed() {
        val avg = ref.refactorDogSpeed()
        assertTrue(avg in 12.0..15.0)
        assertEquals(13.33, avg, 0.1)
    }

    @Test
    fun refactorCafeOrders() {
        val orders = ref.refactorCafeOrders()
        assertTrue("Espresso" in orders)
        assertFalse("" in orders)
        assertEquals(2, orders.size)
    }

    @Test
    fun refactorWorkoutVolume() {
        val volume = ref.refactorWorkoutVolume()
        // (100 + 80 + 60) * 5 = 1200
        assertEquals(1200.0, volume, 0.0)
    }

    @Test
    fun refactorBudgetCalc() {
        val balance = ref.refactorBudgetCalc()
        // 12000 - (3000+2000+1500) = 5500
        assertEquals(5500.0, balance)
        assertTrue(balance > 0)
    }

    @Test
    fun refactorPeppaTiming() {
        val avg = ref.refactorPeppaTiming()
        // (5 + 7 + 6 + 8) / 4 = 6.5
        assertEquals(6.5, avg, 0.01)
    }

    @Test
    fun refactorShoeStock() {
        val shoes = ref.refactorShoeStock()
        assertEquals(listOf(6, 8, 10, 12), shoes)
        assertTrue(shoes.all { it % 2 == 0 })
    }

}