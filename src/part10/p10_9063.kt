import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var minX = 10000
    var maxX = -10000
    var minY = 10000
    var maxY = -10000
    for(i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()

        if (minX > x) {
            minX = x
        }

        if (maxX < x) {
            maxX = x
        }

        if (minY > y) {
            minY = y
        }

        if (maxY < y) {
            maxY = y
        }
    }

    val result = (maxX - minX) * (maxY - minY)
    println(result)
}