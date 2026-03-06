import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)
    val v = readLine().toInt()
    var result = 0

    for (i: Int in 1..n) {
        val num = st.nextToken().toInt()
        if (v == num) {
            result++
        }
    }
    
    println(result)
}