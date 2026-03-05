import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = 42
    val arr = IntArray(n){0}
    repeat(10) {
        val num = readLine().toInt()
        val mod = num % n
        arr.set(mod, 1)
    }

    var cnt = 0
    repeat(42) {
        if (arr.get(it) > 0) {
            cnt++
        }
    }

    println(cnt)
    close()
}