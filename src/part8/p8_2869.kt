import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val n = st.nextToken().toInt()
    var result = (n - b) / (a - b)
    val remain = (n - b) % (a - b)
    if (remain > 0) {
        result++
    }
    println(result)
}