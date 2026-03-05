import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val n = readLine().toInt()
        if (n == 0) break
        println(findPrime(n))
    }
}

fun findPrime(n: Int): Int {
    var cnt = 0
    val start = n+1
    val end = n*2
    for (i in start..end) {
        if (isPrime(i)) cnt++
    }
    return cnt
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false

    // 홀수만 검사
    var i = 3
    while (i * i <= n) {
        if (n % i == 0) {
            return false
        }
        i += 2
    }
    return true
}