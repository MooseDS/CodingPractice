import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = IntArray(n) { it + 1 }

    repeat(m) {
        val nextRl = readLine()
        val nextSt = StringTokenizer(nextRl)
        var v1 = nextSt.nextToken().toInt() - 1
        var v2 = nextSt.nextToken().toInt() - 1
        while (v1 < v2) {
            val temp = arr[v1]
            arr[v1] = arr[v2]
            arr[v2] = temp

            v1++
            v2--
        }
    }

    println(arr.joinToString(separator = " "))
}