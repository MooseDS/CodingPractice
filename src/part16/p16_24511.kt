import java.io.BufferedReader
import java.util.StringTokenizer
import java.util.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val que = ArrayDeque<Int>()

    val sRl = readLine()
    val sSt = StringTokenizer(sRl)    
    val vRl = readLine()
    val vSt = StringTokenizer(vRl)
    for (i in 0 until n) {
        val num = vSt.nextToken().toInt()
       if (sSt.nextToken().toInt() == 0) {
            que.add(num)
       } 
    }

    val m = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)
    val sb = StringBuilder()
    for (i in 1..m) {
        val next = st.nextToken().toInt()
        que.addFirst(next)
        if (i == m) {
            sb.append(que.removeLast())
        } else {
            sb.append("${que.removeLast()} ")
        }
    }

    println(sb)
}