import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val n = readLine().toInt()

    println(str.get(n - 1))
}