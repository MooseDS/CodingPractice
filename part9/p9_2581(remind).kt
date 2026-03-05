import java.io.BufferedReader
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val m = readLine().toInt()
    val n = readLine().toInt()

    val isPrime = BooleanArray(10001){true}
    isPrime[0] = false
    isPrime[1] = false

    var i = 2
    while (i*i < 10001) {
        if (isPrime[i]) {
            var j = i*i
            while (j < 10001) {
                isPrime[j] = false
                j += i
            }
        }
        i++
    }

    var sum = 0
    var min = n
    for (k in m..n) {
        if (isPrime[k]) {
            sum += k
            if (k < min) {
                min = k
            }
        } 
    }
    if (sum == 0) {
        println("-1")
    } else {
        println(sum)
        println(min)
    }
}