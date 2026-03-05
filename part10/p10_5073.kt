import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val rl = readLine()
        val st = StringTokenizer(rl)

        var max = 0
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()

        if (a == 0 && b == 0 && c == 0) break
        if (a == b && b == c) {
            println("Equilateral")
        } else if (!isValid(a, b, c)) {
            println("Invalid")
        } else if (a == b || b == c || a == c) {
            println("Isosceles")
        } else {
            println("Scalene")
        }
    }
}

fun isValid(a: Int, b: Int, c: Int): Boolean {
    if (a > b) {
        if (a > c) {
            return a < c + b
        } else {
            return c < a + b
        }
    } else {
        if (b > c) {
            return b < a + c
        } else {
            return c < a + b
        }
    }
}
