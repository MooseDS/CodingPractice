import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    val sb = StringBuilder()
    for (i in 1..n) {
        val t = readLine().toLong()
        sb.append(findPrime(t)).append("\n")
    }
    print(sb)
}

fun findPrime(start: Long): Long {
    var j = start
    while(!isPrime(j)) {
        j++
    }
    return j
}

fun isPrime(n: Long): Boolean {
    if (n <= 1L) return false
    if (n == 2L) return true
    if (n % 2L == 0L) return false

    // 홀수만 검사
    var i = 3L
    while (i * i <= n) {
        if (n % i == 0L) {
            return false
        }
        i += 2L
    }
    return true
}