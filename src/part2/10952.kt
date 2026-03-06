import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var rl: String? 

    while(readLine().also {rl = it} != null) {
        val st = StringTokenizer(rl)
        val num1 = st.nextToken().toInt()
        val num2 = st.nextToken().toInt()
        val sum = num1 + num2
        System.out.println(sum)
    }
}