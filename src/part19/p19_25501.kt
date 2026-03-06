import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val calc = CalcPalin()

    for (i in 1..n) {
        val word = readLine()
        calc.isPalindrome(word)
    }
}

class CalcPalin {
    private var cnt = 0

    fun recursion(s: String, l: Int, r: Int): Int {
        cnt++
        if (l >= r) return 1
        else if (s[l] != s[r]) return 0 
        else return recursion(s, l+1, r-1)
    }

    fun isPalindrome(s: String) {
        cnt = 0
        val result = recursion(s, 0, s.length - 1)
        println("${result} ${cnt}")
    }
}
