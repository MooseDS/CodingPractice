import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl);
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    if (a == b && b == c) {
        println(10000 + a * 1000)
    } else if (a == b) {
        println(1000 + a * 100)
    } else if (b == c || a == c) {
        println(1000 + c * 100)
    } else {
        println(maxOf(a, b, c) * 100)
    }
}