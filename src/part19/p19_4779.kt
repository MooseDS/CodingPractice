import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    var line = readLine()
    val sb = StringBuilder()
    while(line != null) {
        val n = line.toInt()
        sb.append(cantor(n)).append("\n")
        line = readLine()
    }

    print(sb.toString())
}

fun cantor(n: Int): String {
    if (n == 0) return "-"

    val prev = cantor(n - 1)
    val center = " ".repeat(3.0.pow((n - 1).toDouble()).toInt())

    return prev + center + prev
}