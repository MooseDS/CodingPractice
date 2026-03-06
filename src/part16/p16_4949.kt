import java.io.BufferedReader
import java.util.Stack  

fun main() = with(System.`in`.bufferedReader()) {
    val st = Stack<Char>()
    
    while(true) {
        val text = readLine()
        if (text.length == 1 && text == ".") break

        var result = "yes"
        for (i in 0 until text.length) {
            val c = text[i]
            if (c == '(') {
                st.push(')')
            } else if (c == '[') {
                st.push(']')
            } else if (c == ')' || c == ']') {
                if (st.isEmpty()) {
                    result = "no"
                } else {
                    val poped = st.pop()
                    if (poped != c) {
                        result = "no"
                    }
                }
            }
        }

        if (!st.isEmpty()) {
            result = "no"
        }

        println(result)
        st.clear()
    }
}