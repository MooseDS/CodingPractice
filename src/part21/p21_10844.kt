fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n+1) { LongArray(10) {0} }

    for (i in 0..9) {
        arr[1][i] = 1
    }

    for (i in 2..n) {
        for (j in 0..9) {
            when (j) {
                0 -> arr[i][j] = arr[i-1][j+1] % 1000000000
                9 -> arr[i][j] = arr[i-1][j-1] % 1000000000
                else -> arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000
            }
        }
    }

    var max = 0L
    for (i in 1..9) {
        max = (max + arr[n][i]) % 1000000000
    }

    println(max)
}