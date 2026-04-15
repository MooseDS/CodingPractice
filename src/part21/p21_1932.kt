import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = Array(n) { IntArray(n) }

    for (i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        if (i == 1) {
            dp[0][0] = st.nextToken().toInt()
        } else {
            for (j in 1..i) {
                val size = st.nextToken().toInt()
                when (j) {
                    1 -> {
                        dp[i - 1][0] = size + dp[i - 2][0]
                    }
                    i -> {
                        dp[i - 1][i - 1] = size + dp[i - 2][i - 2]
                    }
                    else -> {
                        dp[i - 1][j-1] = size + max(dp[i - 2][j - 2], dp[i - 2][j - 1])
                    }
                }
            }
        }
    }

    var max = 0
    for (i in 1..n) {
        if (max < dp[n-1][i-1]) {
            max = dp[n-1][i-1]
        }
    }

    println(max)
}