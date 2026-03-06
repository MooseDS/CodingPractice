import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    println(n * n)
    println("2")
}