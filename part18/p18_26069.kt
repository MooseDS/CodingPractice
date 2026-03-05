import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val set = hashSetOf<String>()
    for (i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val a = st.nextToken()
        val b = st.nextToken()

        if (a == "ChongChong" || b == "ChongChong") {
            set.add(a)
            set.add(b)
        } else if (set.contains(a) && !set.contains(b)) {
            set.add(b)
        } else if (set.contains(b) && !set.contains(a)) {
            set.add(a)
        }
    }

    println(set.size)
} 