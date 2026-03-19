private val sb = StringBuilder()
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for (i in 0..< n) {
        for (j in 0..< n) {
            star(n, i, j)
        }
        sb.append("\n")
    }
    print(sb.toString())
}

fun star(n: Int, i: Int, j: Int) {
    if ((i / n) % 3 == 1 && (j / n) % 3 == 1) {
        sb.append(" ")
    } else {
        if (n / 3 == 0)  sb.append("*")
        else star(n/3, i, j)
    }
}

// arr, 좌표로 다시 풀어보기






