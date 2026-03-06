import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toLong()
    val m = st.nextToken().toLong()

    val g = if (n > m) gcd(n,m) else gcd(m, n)
    println(n*m/g)
}

fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a
    else return gcd(b, a%b) 
}