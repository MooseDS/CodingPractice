import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { Array(2) { "" } }

    // 1. sort
    // 2. arr[age] += "age name\n"

    for (i in 0 until n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        arr[i][0] = st.nextToken()
        arr[i][1] = st.nextToken()
    }

    arr.sortWith{ o1, o2 -> 
        o1[0].toInt() - o2[0].toInt()
    }

    arr.forEach {
        println("${it[0]} ${it[1]}")
    }
}