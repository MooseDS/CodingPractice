import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val str = readLine()
        val v1 = str.get(0)
        val v2 = str.get(str.length - 1)
        println("${v1}${v2}")
    }
}