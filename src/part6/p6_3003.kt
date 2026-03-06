import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val arr = intArrayOf(1, 1, 2, 2, 2, 8)
    
    for(i: Int in 0..5) {
        val num = st.nextToken().toInt()
        arr[i] = arr[i] - num 
    }

    repeat(arr.size) {
        print("${arr.get(it)} ")
    }
}