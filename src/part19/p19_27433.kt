import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    println(factory(n))
}

fun factory(n: Long): Long {
    if (n == 0L || n == 1L) return 1
    return n * factory(n - 1)
}