import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val arr = Array(5){""}
    var max = 0
    val sb = StringBuilder()

    for (i in 0 until 5) {
        arr[i] = readLine()
        if (arr[i].length > max) {
            max = arr[i].length
        }
    }

    for (i in 0 until max) {
        for (j in 0 until 5) {
            val length = arr[j].length
            if (i < length) {
                sb.append(arr[j][i])   
            }
        }
    }

    println(sb.toString())
}