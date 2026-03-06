import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val list = hashSetOf<String>()
    for (i in 1..n) {
        list.add(readLine())
    }

    var cnt = 0
    val result = sortedSetOf<String>()
    for (i in 1..m) {
        val name = readLine()
        if (list.contains(name)) {
            result.add(name)
            cnt++
        }
    }

    val sb = StringBuilder()
    result.forEach {
        sb.append("${it}\n")
    }

    println(cnt)
    print(sb)
} 