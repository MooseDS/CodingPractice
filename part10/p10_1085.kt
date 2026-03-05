import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val h = st.nextToken().toInt()

    var min = x
    if (min > y) {
        min = y
    }
    if (min > w - x) {
        min = w - x
    }
    if (min > h - y) {
        min = h - y
    }
    println(min)
}