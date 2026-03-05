import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken()
    val b = st.nextToken().toInt()
    
    var result = 0
    for (i in 0 until n.length) {
        var num = getConvertNum(n[i])
        val convert = n.length - i - 1
        for (j in 0 until convert) {
           num *= b 
        }
        result += num
    }
    println(result)
}

fun getConvertNum(n: Char): Int {
    val num = n.code
    if (num < 58) {
        return num - 48
    } else {
        return num - 55
    }
}