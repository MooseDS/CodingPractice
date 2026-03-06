import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val stack = StackArr()
    val n = readLine().toInt()

    val sb = StringBuilder()
    for (i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val case = st.nextToken().toInt()
        
        when (case) {
            1 -> {
                val v = st.nextToken().toInt()
                stack.push(v)
            }
            2 -> {
                sb.append(stack.pop()).append("\n")
            }
            3 -> {
                sb.append(stack.size()).append("\n")
            }
            4 -> {
                sb.append(stack.isEmpty()).append("\n")
            }
            5 -> {
                sb.append(stack.peek()).append("\n")
            }
        }
    }
    print(sb)
}

class StackArr {
    val stack = IntArray(1000001) {0}
    var top = 0

    fun push(n: Int) {
        stack[top] = n
        top++
    }

    fun pop(): Int {
        if (top == 0) return -1
        val poped = stack[top - 1]
        stack[top - 1] = 0
        top--
        return poped
    }

    fun size(): Int {
        return top
    }

    fun isEmpty(): Int {
        if (top == 0) return 1
        return 0
    }

    fun peek(): Int {
        if (top == 0) return -1
        return stack[top - 1]
    }
}