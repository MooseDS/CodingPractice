import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { IntArray(n) }

    for (i in 0..<n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        for (j in 0..<n) {
            arr[i][j] = st.nextToken().toInt()
        }
    }
    // 부분 Sum 과 AllSum 차이로 계산 미리 한다.
    // '0'번째 자리 1번으로 고정하면 중복 제거됨
}

/*
// 중복 제거 필요, 계산 절약 필요
private val a = ArrayDeque<Int>()
private val b = ArrayDeque<Int>()

private var min = Int.MAX_VALUE
private fun teamMatch(arr: Array<IntArray>, remain: Int, size: Int) {
    if (remain == 0) {
        val a = teamResult(arr, a)
        val b = teamResult(arr, b)
        val diff = abs(a - b)
        if (min > diff) {
            min = diff
        }
        return
    }

    // remain, remain-2
    // 1. a 에 두개
    if (a.size + 2 <= size) {
        a.addLast(remain)
        a.addLast(remain - 1)
        teamMatch(arr, remain - 2, size)
        a.removeLast()
        a.removeLast()
    }

    // 2. b 에 두개
    if (b.size + 2 <= size) {
        b.addLast(remain)
        b.addLast(remain - 1)
        teamMatch(arr, remain - 2, size)
        b.removeLast()
        b.removeLast()
    }

    // 3. a 에 remain, b 에 remain -2
    if (a.size + 1 <= size && b.size + 1 <= size) {
        a.addLast(remain)
        b.addLast(remain - 1)
        teamMatch(arr, remain - 2, size)
        a.removeLast()
        b.removeLast()
    }

    // 4. a 에 remain - 2, a에 remain
    if (a.size + 1 <= size && b.size + 1 <= size) {
        a.addLast(remain - 1)
        b.addLast(remain)
        teamMatch(arr, remain - 2, size)
        a.removeLast()
        b.removeLast()
    }
}

private fun teamResult(arr: Array<IntArray>, team: ArrayDeque<Int>): Int {
    var result = 0
    for (i in 0 ..< team.size) {
        for (j in i + 1 ..< team.size) {
            result += calc(arr, team[i]-1, team[j]-1)
        }
    }
    return result
}

private fun calc(arr: Array<IntArray>, i: Int, j: Int): Int = arr[i][j] + arr[j][i]
 */