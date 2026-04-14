import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

private val bw = BufferedWriter(OutputStreamWriter(System.`out`))
fun main() = with(System.`in`.bufferedReader()) {
    val sudoArr = Array(9) { CharArray(9) }

    for (i in 0..<9) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        for (j in 0..<9) {
            sudoArr[i][j] = (st.nextToken().toInt() + 48).toChar()
        }
    }

    runSudoku(sudoArr, 0, 0)
    bw.flush()
    bw.close()
}

// 가로, 세로, 3x3 에 해당 숫자가 있는지 검사

private var isFind = false
private fun runSudoku(arr: Array<CharArray>, curX: Int, curY: Int) {
    if (curX == 9) {
        if (!isFind) {
            for (row in arr) {
                bw.write(row.joinToString(" "))
                bw.newLine()
            }
            isFind = true
        }
        return
    }

    var nextX = curX
    var nextY = curY + 1
    if (nextY == 9) {
        nextY = 0
        nextX++
    }

    if (arr[curX][curY] != '0') {
        runSudoku(arr, nextX, nextY)
        return
    }

    for (i in 1..9) {
        if (isValidNum(arr, curX, curY, i)) {
            arr[curX][curY] = (i + 48).toChar()
            runSudoku(arr, nextX, nextY)
            arr[curX][curY] = '0'
        }
    }
}


fun isValidNum(arr: Array<CharArray>, curX: Int, curY: Int, num: Int): Boolean {
    // TODO for문의 시간을 줄이는 것이 관건
    val n = (num + 48).toChar()
    for (i in 0..<9) {
        if (arr[i][curY] == n || arr[curX][i] == n) {
            return false
        }
    }

    // TODO Remind startX, startY 좌표 구하기 
    val startX = curX / 3 * 3
    val startY = curY / 3 * 3
    for (i in 0..2) {
        for (j in 0..2) {
            if (arr[startX + i][startY + j] == n) {
                return false
            }
        }
    }
    return true
}