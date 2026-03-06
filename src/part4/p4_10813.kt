import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val arr = IntArray(n) { it + 1 }
    // repeat(m)
    for (i: Int in 1..m) {
        val nextRl = readLine()
        val nextSt = StringTokenizer(nextRl)
        val v1 = nextSt.nextToken().toInt() - 1 
        val v2 = nextSt.nextToken().toInt() - 1
        
        // arr.get(i), arr.set(i, j)
        val temp = arr[v1]
        arr[v1] = arr[v2]
        arr[v2] = temp
    }

    // repeat(arr.size) { print("${arr.get(it)} ") }
    println(arr.joinToString(separator = " "))
}