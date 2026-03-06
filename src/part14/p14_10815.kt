import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cardSet = mutableSetOf<Int>()

    val rl = readLine()
    val st = StringTokenizer(rl)
    for (i in 0 until n) {
        val c = st.nextToken().toInt()
        cardSet.add(c)
    }

    val m = readLine().toInt()
    val mRl = readLine()
    val mSt = StringTokenizer(mRl)
    val sb = StringBuilder()
    for (i in 0 until m) {
        val x = mSt.nextToken().toInt()
        if (cardSet.contains(x)) {
            sb.append("1")
        } else {
            sb.append("0")
        }
        sb.append(" ")
    }
    println(sb)
}