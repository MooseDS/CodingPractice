import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val list = arrayOf(a, b, c)
    list.sort()

    // 삼각형의 조건 두변의 합 > 가장 긴변
    if (list[0] + list[1] > list[2]) {
        println(list[0] + list[1] + list[2])    
    } else {
        println(2 * list[0] + 2 * list[1] - 1)
    }
}