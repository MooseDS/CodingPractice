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
    combination3(n, m, cArr, 0)
    bw.flush()
    bw.close()
}

// joinToString 대신 짝수자리 공백으로 만들기
private fun combination3(n: Int, m: Int, cArr: CharArray, k: Int) {
    if (m == 0) {
        bw.write(cArr)
        bw.write("\n")
        return
    }

    for (i in 1..n) {
        cArr[k] = (i + 48).toChar()
        combination3(n, m - 1, cArr, k + 2)
    }
}

