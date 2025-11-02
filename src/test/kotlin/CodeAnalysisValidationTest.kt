import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class CodeAnalysisValidationTest {

    private val v = CodeAnalysisValidation()

    @Test
    fun analyzeCats() {
        val result = v.analyzeCats()
        assertTrue(result.contains("Cat Mood Average"))
        assertTrue(result.contains("Happy"))  // should be happy
    }

    @Test
    fun validateDogs() {
        val results = v.validateDogs()
        assertEquals(listOf(Pair("Rex", true), Pair("Rocky", false)), results)
    }

    @Test
    fun validateOrders() {
        val validOrders = v.validateOrders()
        assertTrue(validOrders.contains("Latte"))
        assertFalse(validOrders.contains(""))
    }

    @Test
    fun validateWorkoutInput() {
        assertTrue(v.validateWorkoutInput(100.0, 12))
        assertFalse(v.validateWorkoutInput(600.0, 12)) // too heavy
        assertFalse(v.validateWorkoutInput(100.0, 0))  // invalid reps
    }

    @Test
    fun analyzeBudget() {
        val result = v.analyzeBudget()
        assertTrue(result.contains("Expense Ratio"))
        assertTrue(result.contains("Within Budget"))
    }

    @Test
    fun validatePeppaContent() {
        val safe = v.validatePeppaContent()
        assertEquals(listOf("Happy Birthday"), safe)
    }

    @Test
    fun validateShoeEntry() {
        assertTrue(v.validateShoeEntry("Nike", 10))
        assertFalse(v.validateShoeEntry("", 10))
        assertFalse(v.validateShoeEntry("Adidas", 2))
    }
}
