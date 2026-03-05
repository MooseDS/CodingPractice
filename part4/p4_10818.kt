import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val cnt = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)
    var min = 1000000
    var max = -1000000
    for (i: Int in 1..cnt) {
        val num = st.nextToken().toInt()
        if (num < min) min = num
        if (num > max) max = num
    }
    println("$min $max")
}