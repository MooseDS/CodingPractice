import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val xray = IntArray(3, {0})
    val yray = IntArray(3, {0})
    for (i in 0..2) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        if (i < 2) {
            xray[i] = a
            yray[i] = b
        } else {
            xray[2] = getPosition(xray[0], xray[1], a)
            yray[2] = getPosition(yray[0], yray[1], b)
        }
    }

    println("${xray[2]} ${yray[2]}")
}

fun getPosition(a: Int, b: Int, c: Int): Int {
    if (a == b) return c
    else if (a == c) return b
    else return a
}