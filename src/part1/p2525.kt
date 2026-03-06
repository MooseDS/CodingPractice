import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl);

    val num1 = st.nextToken().toInt()
    val num2 = st.nextToken().toInt()
    val num3 = readLine().toInt()

    var hour = num3 / 60 + num1
    var mins = num3 % 60 + num2

    if (mins / 60 > 0) {
        hour++
        mins -= 60
    }

    hour = hour % 24
    println("${hour} ${mins}") 
}