import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)
    val arr = IntArray(n){0}

    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }

    arr.sort()
    println(arr[0] * arr[n-1])
}
