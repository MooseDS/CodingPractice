import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val size = 1000001
    val isPrime = BooleanArray(size) {true}
    isPrime[0] = false
    isPrime[1] = false

    var i = 2
    while(i*i < size) {
        if (isPrime[i]) {
            var j = i*i
            while(j < size) {
                isPrime[j] = false
                j += i
            }
        }
        i++
    }
    
    val sb = StringBuilder()
    for (i in 1..t) {
        val n = readLine().toInt()
        val h = n / 2
        var cnt = 0
        for (i in 2..h) {
            if (isPrime[i] && isPrime[n - i]) {
                cnt++
            }
        }
        sb.append("${cnt}\n")
    }
    print(sb)
}