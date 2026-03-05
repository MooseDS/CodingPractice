import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)
    val isPrime = BooleanArray(1001){true}
    isPrime[0] = false
    isPrime[1] = false

    var i = 2
    while (i * i < 1001) {
        if (isPrime[i]) {
            var j = i*i
            while (j < 1001) {
                isPrime[j] = false
                j += i
            }
        }       
        i++
    } 


    var cnt = 0
    for (i in 1..n) {
        val m = st.nextToken().toInt()
        if (isPrime[m]) {
            cnt++
        }
    }

    println(cnt)
}