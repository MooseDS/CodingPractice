import java.io.BufferedReader
import java.util.StringTokenizer
import java.util.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)
    val dq = ArrayDeque<Int>()

    var current = 1
    for (i in 1..n) {
        val next = st.nextToken().toInt()
        dq.push(next)
        while(!dq.isEmpty() && current == dq.first()) {
            current++
            dq.removeFirst()
        }
    }

    val result = if (current - 1 == n) "Nice" else "Sad"
    println(result)
}