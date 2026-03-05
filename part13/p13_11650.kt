import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { IntArray(2) {0} }
    
    for (i in 0 until n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        arr[i][0] = x
        arr[i][1] = y
    }

    // 좌표정렬
    // 1. arr[i][0], arr[i][1]
    // 2. 20000020000 (x + 100000) * 100000 + y + 100000 // xy 구분 /,% 활용하기

    arr.sortWith { a1, a2 -> 
        if (a1[0] == a2[0]) {
            a1[1] - a2[1]
        } else {
            a1[0] - a2[0]
        }
    }

    for (i in 0 until n) {
        println("${arr[i][0]} ${arr[i][1]}")
    }
}