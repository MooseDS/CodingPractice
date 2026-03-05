import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val m = st.nextToken().toInt()
    val n = st.nextToken().toInt()

    val size = 1000001
    val pArr = BooleanArray(size) {true}
    pArr[0] = false
    pArr[1] = false

    var i = 2
    while(i*i < size) {
        if (pArr[i]) {
            var j = i * i
            while(j < size) {
                pArr[j] = false
                j += i
            }
        }
        i++
    }

    val sb = StringBuilder()
    for (i in m..n) {
        if (pArr[i]) {
            sb.append("${i}\n")
        }
    }
    print(sb)
}
