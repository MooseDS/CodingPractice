import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = BooleanArray(2000001)

    for (i in 1..n) {
        val k = readLine().toInt()
        arr[k + 1000000] = true
    }  

    val sb = StringBuilder()
    for (i in 0..2000000) {
        if (arr[i]) {
            sb.append("${i-1000000}\n")
        }
    }

    println(sb.toString())
}