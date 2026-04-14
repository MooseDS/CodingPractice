fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    fib(n)
    val b = fibonacci(n)
    print("$fibCnt $b")
}

var fibCnt = 0
private fun fib(n: Int): Int {
    if (n == 1 || n == 2) {
        fibCnt++
        return 1
    }
    else return fib(n-1) + fib(n-2)
}

private fun fibonacci(n: Int): Int {
    var cnt = 0
    val arr = IntArray(n + 1)
    arr[1] = 1
    arr[2] = 1
    for (i in 3..n) {
        cnt++
        arr[i] = arr[i - 1] + arr[i - 2]
    }
    return cnt
}