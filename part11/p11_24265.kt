import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    val result = n * (n - 1)
    println(result / 2)
    println("2")
}