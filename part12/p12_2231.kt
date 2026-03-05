import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    var result = 0
    for (i in 1..n) {
        var sum = i
        var j = i
        while (j > 0){
            sum += j % 10
            j /= 10
        }
        if (n == sum) {
            result = i
            break
        }
    }

    println(result)
}