import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()
    val d = st.nextToken().toInt()
    val e = st.nextToken().toInt()
    val f = st.nextToken().toInt()
    // ax + dx + by + ey = c + f
    for (i in -999..999) {
        for (j in -999..999) {
            if (a*i + b*j == c && d*i + e*j == f) {
                println("$i $j")
            }
        }
    }
}