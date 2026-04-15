import java.util.StringTokenizer
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = Array(n) { IntArray(3) }

    for (i in 0..<n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val r = st.nextToken().toInt()
        val g = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        if (i > 0) {
            dp[i][0] = r + min(dp[i - 1][1], dp[i - 1][2])
            dp[i][1] = g + min(dp[i - 1][0], dp[i - 1][2])
            dp[i][2] = b + min(dp[i - 1][0], dp[i - 1][1])
        } else {
            dp[i][0] = r
            dp[i][1] = g
            dp[i][2] = b
        }
    }

    println(minOf(dp[n - 1][0], dp[n - 1][1], dp[n-1][2]))
}