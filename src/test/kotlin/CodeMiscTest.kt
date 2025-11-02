import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CodeMiscTest {
    private val misc = CodeMisc()

    @Test
    fun docCats() {
        val result = misc.docCats()
        assertTrue(result.contains("Cat API Docs"))
        assertTrue(result.endsWith("Complete"))
    }

    @Test
    fun designDogs() {
        val result = misc.designDogs()
        assertTrue(result.contains("Dog Tracker UI"))
        assertTrue(result.contains("Material layout"))
    }

    @Test
    fun automateCafe() {
        val result = misc.automateCafe()
        assertTrue(result.contains("Café CI/CD"))
        assertTrue(result.contains("Build"))
        assertTrue(result.contains("Deploy"))
    }

    @Test
    fun manageWeightliftingProject() {
        val result = misc.manageWeightliftingProject()
        assertTrue(result.contains("Phase 1: Start"))
        assertTrue(result.contains("Phase 3: Maintenance"))
        assertEquals(3, result.lines().size)
    }

    @Test
    fun ciFinances() {
        val result = misc.ciFinances()
        assertTrue(result.startsWith("Running Financial Report"))
        assertTrue(result.endsWith("done"))
    }

    @Test
    fun generatePeppaDocs() {
        val result = misc.generatePeppaDocs()
        assertEquals("Exporting Peppa Pig episode documentation", result)
    }

    @Test
    fun designShoesUI() {
        val result = misc.designShoesUI()
        assertTrue(result.contains("Shoe Shop layout"))
        assertTrue(result.contains("responsive"))
    }

}