
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n, {0})
    val cntArr = IntArray(10001, {0})
    val sortedArr = IntArray(n, {0})

    for (i in 0 until n) {
        arr[i] = readLine().toInt()
    }

    for (i in 0 until n) {
        cntArr[arr[i]]++
    }

    for (i in 1..10000) {
        cntArr[i] += cntArr[i-1]
    }

    var i = n-1
    while(i >= 0) {
        val k = arr[i]
        cntArr[k]--
        sortedArr[cntArr[k]] = k
        i-- 
    }

    val sb = StringBuilder()
    for (i in 0 until n) {
        println(sortedArr[i])
    }
}