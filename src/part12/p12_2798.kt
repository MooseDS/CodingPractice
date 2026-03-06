import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val dec = readLine()   
    val decSt = StringTokenizer(dec)
    val array = IntArray(n) {0}
    for (i in 0 until n) {
        val card = decSt.nextToken().toInt()
        array[i] = card
    } 

    var result = 0
    for (i in 0 until n - 2) {
        for (j in i+1 until n - 1) {
            for (k in j+1 until n) {
                val sum = array[i] + array[j] + array[k]
                if (sum <= 300000 && m - sum >= 0 && result <= sum) {
                    result = sum
                }                              
            }
        }
    }       
    println(result)
}