import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val a1 = st.nextToken().toInt()
    val a0 = st.nextToken().toInt()
    val c = readLine().toInt()
    val n0 = readLine().toInt()

    if (a0 < 0 && c - a1 < 0) {
        println("0")
    } else if (a0 < 0 && c - a1 >= 0) {
        println("1")
    } else if (a0 > 0 && c - a1 < 0) {
        println("0")
    } else {
        if (a1 <= (c - a1) * n0) {
            println("1")
        } else {
            println("0")
        }
    }
} 