import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

private val bw = BufferedWriter(OutputStreamWriter(System.`out`))
fun main() = with(System.`in`.bufferedReader()) {
    // sudoku
    // 0이 있는 위치 i,j
    val origin = Array(9) { CharArray(9) }
    val zeros = ArrayDeque<Pair<Int, Int>>()
    val cols = Array(9) { BooleanArray(10) { false } }
    val rows = Array(9) { BooleanArray(10) { false } }
    val nears = Array(9) { BooleanArray(10) { false } }

    for (i in 0..<9) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        for (j in 0..<9) {
            val num = st.nextToken().toInt()
            origin[i][j] = (num + 48).toChar()
            if (num != 0) {
                cols[i][num] = true
                rows[j][num] = true
                nears[(i/3 * 3) + j/3][num] = true
            } else {
                zeros.add(Pair(i, j))
            }
        }
    }

    runSudoku(origin, zeros, cols, rows, nears, 0)

    bw.flush()
    bw.close()
}

private var isFind = false
private fun runSudoku(
    origin: Array<CharArray>,
    zeros: ArrayDeque<Pair<Int, Int>>,
    cols: Array<BooleanArray>,
    rows: Array<BooleanArray>,
    nears: Array<BooleanArray>,
    index: Int
) {
    if (zeros.size == index) {
        if (!isFind) {
            for (row in origin) {
                bw.write(row.joinToString(" "))
                bw.newLine()
            }
            isFind = true
        }
        return
    }

    val point = zeros[index]
    val i = point.first
    val j = point.second
    for (num in 1..9) {
        if (!cols[i][num] && !rows[j][num] && !nears[(i/3 * 3) + j/3][num]) {
            cols[i][num] = true
            rows[j][num] = true
            nears[(i/3 * 3) + j/3][num] = true
            origin[i][j] = (num + 48).toChar()
            runSudoku(origin, zeros, cols, rows, nears, index + 1)
            cols[i][num] = false
            rows[j][num] = false
            nears[(i/3 * 3) + j/3][num] = false
            origin[i][j] = '0'
        }
    }
}