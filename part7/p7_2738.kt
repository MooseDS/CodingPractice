import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = Array(n, {Array(m, {0})})

    for (i in 0 until n) {
        val arl = readLine()
        val ast = StringTokenizer(arl)
        for (j in 0 until m) {
            val a = ast.nextToken().toInt()
            arr[i][j] += a
        }
    }

    for (i in 0 until n) {
        val brl = readLine()
        val bst = StringTokenizer(brl)
        for (j in 0 until m) {
            val b = bst.nextToken().toInt()
            arr[i][j] += b
        }
    }

    arr.forEach { row ->
        println(row.joinToString(" "))
    }
}