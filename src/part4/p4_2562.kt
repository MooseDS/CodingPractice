import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var max = 0
    var index = 0
    for (i: Int in 1..9) {
        val num = readLine().toInt()
        if (max <= num) {
            max = num
            index = i
        }
    }
    println(max)
    println(index)
}