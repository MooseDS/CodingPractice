import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n) {0}

    var g = 1
    for (i in 0 until n) {
        arr[i] = readLine().toInt()
        if (i > 1) {
            val diff = arr[i] - arr[i-1]
            g = if (g > diff) gcd(g, diff) else gcd(diff, g)
        } else if (i == 1) {
            g = arr[i] - arr[i-1]
        }
    }

    var result = 0
    for (i in 1 until n) {
        val diff = arr[i] - arr[i-1]
        result += diff / g - 1
    }

    println(result)
    // diffSum / gcd - (n - 1)
}

fun gcd(a: Int, b: Int):Int = 
    if (b == 0) a else gcd(b, a%b)