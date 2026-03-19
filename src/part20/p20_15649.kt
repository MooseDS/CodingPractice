import java.util.StringTokenizer

private val sb = StringBuilder()
fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    // n 은 사이즈
    // m 은 for문 개수
    combination(n, m, "")
    print(sb.toString())
}


private fun combination(n: Int, m: Int, s: String) {
    if (m == 0) {
        sb.append(s).append("\n")
        return
    }

    val arr = BooleanArray(n + 1) {false}
    s.split(" ").forEach {
        if (it.isNotEmpty()) arr[it.toInt()] = true
    }

    for (i in 1..n) {
        // 중복 제거, 빈칸 제거
        if (!arr[i]) {
            val p = "$s$i" + if (m > 1) " " else ""
            combination(n, m - 1, p)
        }
    }
}
