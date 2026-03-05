import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val aSet = hashSetOf<Int>()
    val bSet = hashSetOf<Int>()

    val aRl = readLine()
    val aSt = StringTokenizer(aRl)
    val bRl = readLine()
    val bSt = StringTokenizer(bRl)
    for (i in 1..n) {
        aSet.add(aSt.nextToken().toInt())
    }

    var cnt = 0
    for (i in 1..m) {
        val b = bSt.nextToken().toInt()
        if (!aSet.contains(b)) {
            cnt++
        }
        bSet.add(b)
    }

    aSet.forEach {
        if (!bSet.contains(it)) {
            cnt++
        }
    }

    println(cnt)
}