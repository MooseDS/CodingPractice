import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(10001)
    val dp = IntArray(10001) {0}

    for (i in 1..n) {
        arr[i] = readLine().toInt()
    }

    dp[1] = arr[1]
    dp[2] = arr[1] + arr[2]

    for (i in 3..n) {
        val curDrink = max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i])
        // 포함하지 않아도 이전값이 더 클수도 있다.
        dp[i] = max(dp[i-1], curDrink)
    }

    print(dp[n])
}