fun main(args: Array<String>) {
    val divisorAndWordList = listOf(
        DivisorAndWord(3, "FIZZ"),
        DivisorAndWord(5, "BUZZ")
    )
    val fizzBuzz = FizzBuzz(divisorAndWordList)
    (1..100).forEach { println(fizzBuzz.fizzbuzz(it)) }
}