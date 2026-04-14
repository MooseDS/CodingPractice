import java.util.StringTokenizer

// TODO 시간초과 해결하기
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n) { 0 }
    var max = -1001

    val rl = readLine()
    val st = StringTokenizer(rl)

    for (i in 1..n) {
        val k = st.nextToken().toInt()
        for (j in 1..i) {
            arr[j-1] += k
            if (max < arr[j-1]) {
                max = arr[j-1]
            }
        }
    }

    print(max)
}
