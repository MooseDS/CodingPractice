import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numArr = IntArray(n)
    val opArr = IntArray(4)

    val rl = readLine()
    val st = StringTokenizer(rl)

    for (i in 0..<n) {
        numArr[i] = st.nextToken().toInt()
    }

    val opRl = readLine()
    val opSt = StringTokenizer(opRl)

    for (i in 0..3) {
        opArr[i] = opSt.nextToken().toInt()
    }

    operateMinMax(numArr, opArr, 0, numArr[0])

    println(max)
    println(min)
}

private var min = Int.MAX_VALUE
private var max = Int.MIN_VALUE
private fun operateMinMax(arr: IntArray, opArr: IntArray, depth: Int, result: Int) {
    if (depth == arr.size - 1) {
        if (result < min) {
            min = result
        }
        if (result > max) {
            max = result
        }
        return
    }

    for (i in 0..3) {
        if (opArr[i] > 0) {
            opArr[i]--
            operateMinMax(arr, opArr, depth + 1, calc(result, arr[depth + 1], i))
            opArr[i]++
        }
    }
}

private fun calc(a: Int, b: Int, op: Int): Int {
    when(op) {
        0 -> return a + b
        1 -> return a - b
        2 -> return a * b
        3 -> return a / b
    }
    return a
}