import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val logMap = mutableMapOf<String, Boolean>()
    
    for (i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val name = st.nextToken()
        val status = if (st.nextToken() == "enter") true else false
        logMap.put(name, status)
    }

    val filtered = logMap.filterValues { it == true }
    val sorted = filtered.toSortedMap(Comparator.reverseOrder())
    val sb = StringBuilder()
    sorted.forEach {
        sb.append("${it.key}\n")
    }
    println(sb)
}