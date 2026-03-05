import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val sb = StringBuilder()
    val dp = Array(31, {IntArray(31, {0})})
    dp[1][1] = 1
    dp[1][0] = 1

    for (i in 2..30) {
        for (j in 0..30) {
            if (j == 0 || i == j) {
                dp[i][j] = 1
            } else {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
            }
        }
    }

    for(i in 1..t) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()
        sb.append(dp[m][n]).append("\n")
    }   

    print(sb)
}
