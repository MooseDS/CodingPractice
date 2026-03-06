import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    var i = 1
    var cnt = 0
    while (i*i <= n) {
        cnt++
        i++
    }
    println(cnt)
 }