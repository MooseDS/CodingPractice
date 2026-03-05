import java.io.BufferedReader
import java.util.StringTokenizer
import java.util.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val que = ArrayDeque<Int>()

    val sb = StringBuilder()
    repeat(n) {
        val st = StringTokenizer(readLine())
        if (st.hasMoreTokens()) {
            when (st.nextToken().toInt()) {
                1 -> que.addFirst(st.nextToken().toInt())
                2 -> que.addLast(st.nextToken().toInt())
                3 -> sb.append(if (que.isEmpty()) "-1\n" else "${que.removeFirst()}\n")
                4 -> sb.append(if (que.isEmpty()) "-1\n" else "${que.removeLast()}\n")
                5 -> sb.append("${que.size}\n")
                6 -> sb.append(if (que.isEmpty()) "1\n" else "0\n")
                7 -> sb.append(que.peekFirst() ?: "-1\n").append(if (que.peekFirst() != null) "\n" else "")
                // peekFirst/Last를 활용하면 null 체크가 더 간결해집니다.
                8 -> sb.append(que.peekLast() ?: "-1\n").append(if (que.peekLast() != null) "\n" else "")
            }
        }
    }
    print(sb)
}