import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val sRl = readLine()
    val sSt = StringTokenizer(sRl)
    val arr = IntArray(n, {0})
    for (i in 0 until n) {
        arr[i] = sSt.nextToken().toInt()
    }   

    arr.sort()
    println(arr[n-k])
}