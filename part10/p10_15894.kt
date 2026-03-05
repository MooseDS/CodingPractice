import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine().toLong()
    println(rl * 4)
}