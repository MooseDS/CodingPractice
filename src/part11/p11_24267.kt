import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    var result = 0L
    for (i in 1..n-2) {
        result += i * (n - i - 1)
    }

    // 등차수열 
    // nCr = n! / (n-r)! * r! =>  n(n-1)(n-2) / 3!
    println(result)
    println("3")
}