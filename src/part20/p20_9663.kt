
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    val arr = IntArray(n) { -1 }
    nQueen(arr,n,0)
    println(cnt)
}

// 1. 가로, 세로, 왼쪽 대각선, 오른쪽 대각선에 자리수 만큼의 불가능 자리를 바로바로 체크한다
// 2. Bit 값으로 제어한다

private var cnt = 0
fun nQueen(arr: IntArray, n: Int, k: Int) {
    if (n == k) {
        cnt++
        return
    }

    // 자신의 위치
    for (i in 0..<n) {
        // 가로 세로, 대각선 체크
        if (arr[i] < 0 && !findQueen(arr, k, i))  {
            arr[i] = k
            nQueen(arr, n, k+1)
            arr[i] = -1
        }
    }
}

private fun findQueen(arr: IntArray, y:Int, x:Int): Boolean {
    for (i in 1..<arr.size-x) {
        if (y - i < 0) break
        if (arr[x+i] == y - i) {
            return true
        }
    }

    for (i in 1..x) {
        if (y - i < 0) break
        if (arr[x-i] == y - i) {
            return true
        }
    }
    return false
}

private fun findQueenDepth(arr: IntArray, y:Int, x:Int, depth: Int): Boolean {
    if (y - depth < 0) return false

    val curY = y - depth
    if (x - depth >= 0 && arr[x - depth] == curY) return true
    if (x + depth < arr.size && arr[x + depth] == curY) return true
    return findQueenDepth(arr, y, x, depth + 1)
}

/*
fun main() {
    val n = readln().toInt()
    val full = (1 shl n) - 1
    var count = 0

    fun dfs(cols: Int, diag1: Int, diag2: Int) {
        if (cols == full) {
            count++
            return
        }
        var avail = full and (cols or diag1 or diag2).inv()
        while (avail != 0) {
            val bit = avail and -avail
            avail -= bit
            dfs(cols or bit, (diag1 or bit) shl 1 and full, (diag2 or bit) shr 1)
        }
    }

    dfs(0, 0, 0)
    println(count)
}
*/