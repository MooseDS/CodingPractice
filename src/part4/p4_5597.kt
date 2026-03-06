import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    // IntArray -> BooleanArray
    val arr = IntArray(30){0}
    for(i: Int in 1..28) {
        val num = readLine().toInt()
        arr[num-1] = 1
    }

    var cnt = 0
    for(i: Int in 1..30) {
        if (arr[i-1] == 0) {
            println(i)
            cnt++
        }
        if (cnt == 2) {
            break
        }
    }
}