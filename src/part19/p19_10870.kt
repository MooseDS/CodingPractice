import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    println(fibo(n))
}

fun fibo(n: Int): Int {
    if (n == 0) return 0
    else if (n == 1) return 1 
    return fibo(n-1) + fibo(n-2)
}