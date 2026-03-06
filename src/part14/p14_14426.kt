import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    
    val s = hashSetOf<String>()
    for (i in 1..n) {
        s.add(readLine())
    }    

    var cnt = 0
    for (i in 1..m) {
        if (s.contains(readLine())) {
            cnt++
        }
    }
    println(cnt)
}