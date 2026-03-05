import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var sum = 0f
    var creditTotal = 0f
    for (i: Int in 1..20) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val subject = st.nextToken()
        val credit = st.nextToken().toFloat()
        val grade = st.nextToken()
        sum += calcGrade(credit, grade)
        if (grade[0] != 'P') {
            creditTotal += credit
        }
    }
    println("${sum/creditTotal}")
}

fun calcGrade(credit: Float, grade: String): Float {
    var result = 0f
    when(grade[0]) {
        'A' -> result = 4f
        'B' -> result = 3f
        'C' -> result = 2f
        'D' -> result = 1f
        else -> result = 0f
    }
    if (result != 0f && grade[1] == '+') {
        result += 0.5f
    }
    return credit * result
}