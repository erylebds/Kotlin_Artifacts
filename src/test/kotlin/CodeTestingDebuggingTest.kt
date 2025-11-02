import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CodeTestingDebuggingTest {
    private val t = CodeTestingDebugging()

    @Test
    fun testCats() {
        assertTrue(t.testCats())
    }

    @Test
    fun testDogs() {
        val result = t.testDogs()
        assertEquals(listOf("Woof!", "Woof!", "Woof!"), result)
        assertEquals(3, result.size)
    }

    @Test
    fun testCafe() {
        val total = t.testCafe()
        assertEquals(240, total)
    }

    @Test
    fun testWeightlifting() {
        assertTrue(t.testWeightlifting())
    }

    @Test
    fun testFinance() {
        val res = t.testFinance()
        assertEquals(2000, res)
    }

    @Test
    fun testPeppaPig() {
        val eps = t.testPeppaPig()
        assertEquals(2, eps.size)
        assertTrue(eps.contains("Picnic"))
    }

    @Test
    fun testShoes() {
        assertTrue(t.testShoes())
    }

}