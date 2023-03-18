import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class FizzBuzzTest {

    val divisorAndWordList: List<DivisorAndWord>

    init {
        divisorAndWordList = listOf(
            DivisorAndWord(3, "FIZZ"),
            DivisorAndWord(5, "BUZZ")
        )
    }
    
    @Test
    fun `can call fizzbuzz fun in FizzBuzz Class`() {
        var fizzBuzzTest = FizzBuzz(divisorAndWordList)
        assertNotNull(fizzBuzzTest)
        assertNotNull(fizzBuzzTest.fizzbuzz(1))
    }

    @ParameterizedTest
    @ValueSource(ints = [1,2,4])
    fun `fizzbuzz of a number not matching to any word return the string representation of the number`(number: Int) {
        var fizzBuzzTest = FizzBuzz(divisorAndWordList)
        assertEquals(""+number, fizzBuzzTest.fizzbuzz(number))
    }

    @Test
    fun `fizzbuzz of a number matching only to one word`() {
        var fizzBuzzTest = FizzBuzz(divisorAndWordList)
        assertEquals("FIZZ", fizzBuzzTest.fizzbuzz(3))
        assertEquals("FIZZ", fizzBuzzTest.fizzbuzz(6))
        assertEquals("BUZZ", fizzBuzzTest.fizzbuzz(5))
        assertEquals("BUZZ", fizzBuzzTest.fizzbuzz(10))
    }

    @Test
    fun `fizzbuzz of a number matching to multiple words`() {
        var fizzBuzzTest = FizzBuzz(divisorAndWordList)
        assertEquals("FIZZBUZZ", fizzBuzzTest.fizzbuzz(15))
        assertEquals("FIZZBUZZ", fizzBuzzTest.fizzbuzz(30))
    }

}