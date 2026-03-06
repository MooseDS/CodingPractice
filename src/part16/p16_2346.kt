import java.io.BufferedReader
import java.util.StringTokenizer
import java.util.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val rl = readLine()
    val st = StringTokenizer(rl)
    val arr = IntArray(n, {0})
    val que = ArrayDeque<Int>()

    for(i in 1..n) {
        arr[i-1] = st.nextToken().toInt()
        que.add(i)
    }

    val sb = StringBuilder()
    var isFirst = true
    while(que.size > 0) {
        val next = if(isFirst) que.remove() else que.removeLast()
        if (que.size > 0) {
            sb.append("${next} ")
        } else {
            sb.append("${next}")
            break
        }

        var move = arr[next - 1]
        if (move > 0) {
            move = move - 1
            repeat(move) {
                val elem = que.remove()
                que.add(elem)
            }
            isFirst = true
        } else {
            move = move + 1
            repeat(move * -1) {
                val elem = que.removeLast()
                que.addFirst(elem)
            }
            isFirst = false
        }
    }
    println(sb)
}