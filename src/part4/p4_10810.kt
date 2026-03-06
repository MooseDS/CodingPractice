import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = IntArray(n){0}

    for (i: Int in 1..m) {
        val nextRl = readLine()
        val nextSt = StringTokenizer(nextRl)
        val v1 = nextSt.nextToken().toInt()
        val v2 = nextSt.nextToken().toInt()
        val v3 = nextSt.nextToken().toInt()
        for (j: Int in v1..v2) {
            arr[j-1] = v3
        }
    }

    println(arr.joinToString(separator = " "))
}