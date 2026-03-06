import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = Array(n, {Array(m, {'W'})})

    for (i in 0 until n) {       
        val boardRl = readLine()
        for (j in 0 until m) {
            arr[i][j] = boardRl[j]
        }
    }

    var min = 64
    for (i in 0 until n-7) {
        for (j in 0 until m-7) {
            val change = calculateMinChanges(arr, i, j)
            min = minOf(min, change)
        }
    }   
    println(min)
}

fun calculateMinChanges(arr: Array<Array<Char>>, i: Int, j: Int): Int {
    val size = 8
    var cnt = 0
    var color = arr[i][j]
    for (a in i..i+7) {
        for (b in j..j+7) {
            if (color != arr[a][b]) {
                cnt++
            }
            color = if (color == 'W') 'B' else 'W'
        }
        color = if (color == 'W') 'B' else 'W'
    }

    return minOf(cnt, 64-cnt)
}


fun getMin(arr: Array<Array<Char>>, i: Int, j: Int, startColor: Char): Int {
    val size = 8
    var cnt = 0
    var color = startColor
    // 첫번째 cnt가 반영되지 않음.
    for (a in i..i+7) {
        for (b in j..j+7) {
            if (a != i || b != j) {
                if (color == arr[a][b]) {
                    cnt++
                }
               color = if (color == 'W') 'B' else 'W'
            }
        }
        color = if (color == 'W') 'B' else 'W'
    }

    return cnt
}

