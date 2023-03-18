class DivisorAndWord(divisor: Int, word: String) {

    val divisor: Int
        get() {
            return field
        }
    val word: String
        get() {
            return field
        }

    init {
        this.divisor = divisor
        this.word = word
    }

    fun isDivisible (number: Int, divisor: Int):Boolean {
        return number % divisor == 0
    }

    fun evaluateAndGetWordOrEmpty (number: Int):String {
        if (isDivisible(number, divisor)) {
            return word
        } else {
            return ""
        }
    }

}