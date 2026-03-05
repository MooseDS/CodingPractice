import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var max = 0
    var n = 0
    var m = 0
    for (i in 0 until 9) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        for (j in 0 until 9) {
            val a = st.nextToken().toInt()
            if ( a > max ) {
                max = a 
                n = i
                m = j
            } 
        }
    }
    println(max)
    println("${n+1} ${m+1}")
}