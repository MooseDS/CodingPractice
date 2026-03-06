import java.io.BufferedReader;

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()
    val b = readLine().toInt()
    println(a*b)
}