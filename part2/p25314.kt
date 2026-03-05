import java.io.BufferedReader;
import java.util.StringTokenizer;

fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().toInt()
    var cnt = num / 4
    if (num % 4 > 0) {
        cnt++
    }
    for (i: Int in 1..cnt) {
        print("long ")
    }
    println("int")
}