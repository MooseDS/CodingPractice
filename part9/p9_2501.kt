import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    
    var cnt = 1
    var result = 0
    for (i in 1..n) {
        if (n % i == 0) {
            if (k == cnt) {
                result = i
            } 
            cnt++
        }        
    }

    println(result)
}