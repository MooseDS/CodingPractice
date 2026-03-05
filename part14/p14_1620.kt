import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val sm = mutableMapOf<String, String>()
    for (i in 1..n) {
        val name = readLine()
        val num = i.toString()
        sm.put(num, name)
        sm.put(name, num)
    }

    val sb = StringBuilder()
    for (i in 1..m) {
        val name = readLine()
        if (sm.contains(name)) {
            sb.append(sm[name]).append("\n")
        }
    }
    println(sb)
}