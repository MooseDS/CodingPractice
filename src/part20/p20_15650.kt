import java.util.StringTokenizer

private val sb = StringBuilder()
fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    combination2(n, m, 0, "")
    print(sb.toString())
}


private fun combination2(n: Int, m: Int, left: Int, s: String) {
    if (m == 0) {
        sb.append(s).append("\n")
        return
    }

    for (i in 1..n) {
        // 오름차순이어야함 = 중복이 없다
        if (left < i && n - i + 1 >= m) {
            // 중복 제거, 빈칸 제거
            val c = "$s$i" + if(m > 1) " " else ""
            combination2(n, m - 1, i, c)
        }

    }
}
