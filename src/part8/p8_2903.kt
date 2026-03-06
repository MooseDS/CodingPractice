import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 1
    for (i in 0 until n) {
        result *= 2
    }
    result++

    print(result * result)
}