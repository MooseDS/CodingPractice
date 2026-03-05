import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    var money = readLine().toLong()
    val cnt = readLine().toInt()
    for (i: Int in 1..cnt) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val o = st.nextToken().toLong()
        val c = st.nextToken().toLong()
        money -= o * c
    }

    if (money == 0L) {
        println("Yes")
    } else {
        println("No")
    }
}