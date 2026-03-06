import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)

    val ballMap = HashMap<Int, Int>()
    for (i in 1..n) {
        val num = st.nextToken().toInt()
        ballMap[num] = ballMap.getOrDefault(num, 0) + 1
    }

    val m = readLine().toInt()
    val mRl = readLine()
    val mSt = StringTokenizer(mRl)
    val sb = StringBuilder()
    for (i in 1..m) {
        val num = mSt.nextToken().toInt()
        sb.append(ballMap.getOrDefault(num, 0)).append(" ")
    }
    println(sb)
}