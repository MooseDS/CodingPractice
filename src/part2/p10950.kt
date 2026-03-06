import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val cnt = readLine().toInt()
    val sb = StringBuilder() // BufferedWriter 로 사용해도 빠른 입력 가능

    for (i: Int in 1..cnt) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val num1 = st.nextToken().toInt()
        val num2 = st.nextToken().toInt() 
        sb.append((num1 + num2)).append('\n')   
    }

    System.out.println(sb.toString())
}