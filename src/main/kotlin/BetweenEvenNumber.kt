class BetweenEvenNumber {
    fun givesEvenNumberBetween(startNumber: Int, endNumber: Int): Int {

        var totalEvenNumber = 0
        for(i in startNumber..endNumber) {
            if(!isNumberEven(i)) {
                continue
            }
            totalEvenNumber++
            println(i)
        }
        return totalEvenNumber
    }




    private fun isNumberEven(startNumber: Int): Boolean {
        return startNumber%2 == 0
    }

    fun givesMaxAndMinNumber(arr: Array<Int>): Array<Int> {
        var ans = Array(2){0}
        var maxNumber = Int.MIN_VALUE
        var minNumber = Int.MAX_VALUE
        for (i in arr) {

            if(i > maxNumber) {
                maxNumber = i
            }
            if(i < minNumber) {
                minNumber = i
            }
        }

        ans[0] = maxNumber
        ans[1] = minNumber

        return ans

    }

}