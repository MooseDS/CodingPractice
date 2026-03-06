import java.io.BufferedReader
import java.util.StringTokenizer
import java.util.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val que = ArrayDeque<Int>()

    for (i in 1..n) {
        que.add(i)
    }

    val sb = StringBuilder()
    sb.append("<")
    while(que.size > 0) {
        for (i in 1 until k) {
            val pop = que.poll()
            que.add(pop)
        }
        if (que.size > 1) {
            sb.append("${que.poll()}, ")
        } else {
            sb.append("${que.poll()}>\n")
        }
    }
    
    print(sb)
}