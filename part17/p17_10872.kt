import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    println(result)
}