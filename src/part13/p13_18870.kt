import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)

    val arr = IntArray(n) {0} // 원본
    val sortedArr = sortedSetOf<Int>()
    val mapArr = mutableMapOf<Int, Int>()
    for (i in 0 until n) {
        val x = st.nextToken().toInt()
        arr[i] = x
        sortedArr.add(x)
    }

    sortedArr.forEachIndexed { index, elem -> 
        mapArr[elem] = index
    }

    val sb = StringBuilder()
    for (i in 0 until n) {
        sb.append(mapArr[arr[i]]).append(" ")
    }

    println(sb)
}
