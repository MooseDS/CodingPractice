fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n + 1)
    dp[0] = 0
    dp[1] = 0

    for (i in 2..n) {
        var min = dp[i-1]
        if (i % 2 == 0 && min > dp[i/2]) {
            min = dp[i/2]
        }
        if (i % 3 == 0 && min > dp[i/3]) {
            min = dp[i/3]
        }
        dp[i] = min + 1
    }

    print(dp[n])
}