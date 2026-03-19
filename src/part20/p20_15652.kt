import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

private val bw = BufferedWriter(OutputStreamWriter(System.`out`))
fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val cArr = CharArray(m * 2 - 1){' '}
    combination4(n, m, cArr, 0)
    bw.flush()
    bw.close()
}

// joinToString 대신 짝수자리 공백으로 만들기
private fun combination4(n: Int, m: Int, cArr: CharArray, k: Int) {
    if (m == 0) {
        bw.write(cArr)
        bw.write("\n")
        return
    }

    for (i in 1..n) {
        if (k > 0 && cArr[k - 2].digitToInt() > i) continue
        cArr[k] = (i + 48).toChar()
        combination4(n, m - 1, cArr, k + 2)
    }
}

