import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    // nCk = n-1Ck-1 + n-1Ck or 1 (k==0 or k == n) 단 0 < k < n
    println(bonomial(n, k))
}

fun bonomial(n: Int, k: Int): Int {
    if (k == 0 || n == k) return 1
    return bonomial(n-1, k-1) + bonomial(n-1, k)
}