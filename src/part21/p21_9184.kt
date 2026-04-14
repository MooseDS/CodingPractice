import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val arr = Array(21) { Array(21) { IntArray(21){ 0 } } }
    while(true) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()
        if (a == -1 && b == -1 && c == -1)  {
            break
        }
        println("w($a, $b, $c) = ${w(arr, a, b, c)}")
    }
}

fun w(arr: Array<Array<IntArray>>, a: Int, b: Int, c: Int): Int {
    if (a <= 0 || b <= 0 || c <= 0)  { return 1 }
    if (a > 20 || b > 20 || c > 20) return w(arr, 20, 20, 20)
    if (arr[a][b][c] > 0) return arr[a][b][c]
    if (a < b && b < c) {
        arr[a][b][c] = w(arr, a, b, c-1) + w(arr, a, b-1, c-1) - w(arr, a, b-1, c)
        return arr[a][b][c]
    }

    arr[a][b][c] = w(arr, a-1, b, c) + w(arr, a-1, b-1, c) + w(arr, a-1, b, c-1) - w(arr, a-1, b-1, c-1)
    return arr[a][b][c]
}