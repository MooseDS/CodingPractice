import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr1 = IntArray(n){0}
    val arr2 = IntArray(8001){0}

    var sum = 0.0
    var max = 0
    for (i in 0 until n) {
        val a = readLine().toInt()
        arr1[i] = a
        arr2[a+4000]++
        if(max <= arr2[a+4000]) {
            max = arr2[a+4000]
        }
        sum += a.toDouble()
    }

    // 기본 value sort
    arr1.sort()
    val result2 = arr1[n/2]
    val result4 = arr1[n-1] - arr1[0]

    // 빈도수 sort
    var a = 8001
    var isSecond = false
    for(i in 0..8000) {
        if (max == arr2[i]) {
            if (a == 8001) {
                a = i - 4000
            } else if (!isSecond) {
                a = i - 4000
                isSecond = true
            }
        }
    }

    println(Math.round(sum/n).toInt())
    println(result2)
    println(a)
    println(result4)
}