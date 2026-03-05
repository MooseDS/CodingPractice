import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        if (a == 0 && b == 0) {
            break
        } else if (b / a > 0 && b % a == 0) {
            println("factor")
        } else if (a / b > 0 && a % b == 0) {
            println("multiple")
        } else {
            println("neither")
        }
    }
}