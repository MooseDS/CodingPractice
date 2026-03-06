import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val arr = IntArray(5, {0})
    var sum = 0
    for (i in 0..4) {
        val n = readLine().toInt()
        arr[i] = n
        sum += n
    }
    arr.sort()
    println(sum/5)
    println(arr[2])    
}