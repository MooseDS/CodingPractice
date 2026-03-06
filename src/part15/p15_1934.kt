import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for (i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        /* 
        val m = minOf(a, b)
        var gcd = 1
        // 최대 공약수 구하기
        for (j in 1..m) {
            if (a % j == 0 && b % j == 0) {
                gcd = j
            }
        }

        // 최소 공배수는 두수의 곱 / 최대 공약수
        println((a*b)/gcd)
        */

        // 유클리드 호제법
        // a = qb + r, a,b 의 최대공약수는 b,r의 최대 공약수이다
        val gcd = if (a > b) gcd(a, b) else gcd(b, a)
        println(a * b / gcd)
    }

}

private fun gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)