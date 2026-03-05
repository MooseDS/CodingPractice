import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var i = 2

    while(n > 1) {
        if (n / i > 0 && n % i == 0) {
            println(i)
            n /= i
        } else {
            i++
        }
    }
}