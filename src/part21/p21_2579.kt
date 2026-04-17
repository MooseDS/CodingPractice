import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val arr = IntArray(301)
    val dp = IntArray(301)
    val n = readLine().toInt()

    for (i in 1..n) {
        arr[i] = readLine().toInt()
    }

    dp[0] = 0
    dp[1] = arr[1]
    dp[2] = arr[1] + arr[2]

    for (i in 3..n) {
        dp[i] = arr[i] + max(dp[i-2], arr[i-1] + dp[i-3])
    }

    println(dp[n])
}