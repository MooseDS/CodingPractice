import java.io.BufferedReader
import java.util.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val que = ArrayDeque<Int>()
    val n = readLine().toInt()

    for (i in 1..n) {
        que.add(i)
    }

    while(que.size > 1) {
        que.poll()
        val item = que.poll()
        que.add(item)
    }

    println(que.poll())
}