import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val arr = Array(100, {Array(100, {0})}) 
    val n = readLine().toInt()
    for (i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val a = st.nextToken().toInt() - 1
        val b = st.nextToken().toInt() - 1
        for (j in a until a+10) {
            for (k in b until b+10) {
                arr[j][k]++
            }
        }
    }

    var result = 0
    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (arr[i][j] > 0) {
                result++
            }
        }
    }

    println(result)
}