import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    var n = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val sb = StringBuilder()

    while(n > 0) {
        val num = n % b
        if (num < 10) {
            sb.insert(0, num)
        } else {
            sb.insert(0, Char(num+55)) 
        }
        n /= b
    }
 
    println(sb.toString())
}


