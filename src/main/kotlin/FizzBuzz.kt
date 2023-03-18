class FizzBuzz(divisorAndWordList: List<DivisorAndWord>) {
    val divisorAndWordList: List<DivisorAndWord>

    init {
        this.divisorAndWordList = divisorAndWordList
    }

    fun fizzbuzz(number: Int):String {
        var result = ""
        divisorAndWordList.forEachIndexed { index, divisorAndWord ->  result += divisorAndWord.evaluateAndGetWordOrEmpty(number)}

        if (result != "") {
            return result
        }

        return number.toString()
    }

}
