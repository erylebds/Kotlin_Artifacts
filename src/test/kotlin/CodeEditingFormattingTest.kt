import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CodeEditingFormattingTest {
    private val editor = CodeEditingFormatting()

    @Test
    fun editCatQuotes() {
        val output = editor.editCatQuotes()
        assertTrue(output.contains("🐾 Feed me human!"))
        assertTrue(output.contains("Nap now"))
        assertTrue(output.contains("Cat Quote Editor"))
    }

    @Test
    fun generateDogTrainingPlan() {
        val output = editor.generateDogTrainingPlan()
        assertTrue(output.contains("Day 1"))
        assertTrue(output.contains("Walk & Fetch"))
        assertTrue(output.lines().size >= 4) // header + 3 days
    }

    @Test
    fun formatCafeMenu() {
        val output = editor.formatCafeMenu()
        assertTrue(output.contains("Latte"))
        assertTrue(output.contains("₱120"))
        assertTrue(output.contains("Cafe Menu"))
    }

    @Test
    fun editWorkoutRoutine() {
        val output = editor.editWorkoutRoutine()
        assertTrue(output.startsWith("Workout Routine Editor"))
        assertTrue(output.contains("Squats 5x5"))
        assertTrue(output.contains("3. Deadlift 3x5"))
    }

    @Test
    fun generateExpenseSummary() {
        val output = editor.generateExpenseSummary()
        assertTrue(output.contains("Rent: ₱15000"))
        assertTrue(output.contains("Total: ₱21000"))
    }

    @Test
    fun formatPeppaEpisodes() {
        val output = editor.formatPeppaEpisodes()
        assertTrue(output.contains("Ep 1: Muddy Puddles"))
        assertTrue(output.contains("Ep 3: Playground"))
    }

    @Test
    fun generateShoeInventory() {
        val output = editor.generateShoeInventory()
        assertTrue(output.contains("Shoe Inventory"))
        assertTrue(output.contains("Nike Air Max"))
        assertTrue(output.contains("Puma RS-X"))
    }

}