import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for (i in 1..n) {
        var change = readLine().toInt()
        print("${change/25} ")
        change %= 25
        print("${change/10} ")
        change %= 10
        print("${change/5} ")
        change %= 5
        println("${change}")
    }
}