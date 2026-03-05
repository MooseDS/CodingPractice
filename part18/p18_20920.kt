import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val map = HashMap<String, Int>()

    // 조건 반복수, 단어 길이, 사전순
    for (i in 1..n) {
        val word = readLine()
        if (word.length >= m) { 
            val cnt = map.getOrDefault(word, 0) + 1
            map.put(word, cnt)
        }
    }

    val sorted = map.toList().sortedWith { o1, o2 -> 
        if (o1.second != o2.second) {
            o2.second - o1.second
        } else {
            if (o1.first.length != o2.first.length) {
                o2.first.length - o1.first.length
            } else {
                o1.first.compareTo(o2.first)
            }
        }
    }

    val sb = StringBuilder()
    sorted.forEach {
        sb.append("${it.first}\n")
    }
    println(sb)
}

// Todo Comparable - data class 만들어보기