import java.io.BufferedReader
import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val s = Stack<Int>()
    for (i in 1..k) {
        val n = readLine().toInt()
        if (n == 0) {
            s.pop()
        } else {
            s.push(n)
        }
    }

    var sum = 0
    s.forEach {
        sum += it
    }
    println(sum)
}