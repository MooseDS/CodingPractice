fun main() = with(System.`in`.bufferedReader()) {
    val arr = LongArray(101)
    val n = readLine().toInt()

    arr[0] = 0
    arr[1] = 1
    arr[2] = 1
    arr[3] = 1
    arr[4] = 2
    arr[5] = 2

    for(i in 6..100) {
        arr[i] = arr[i-5] + arr[i-1]
    }

    val sb = StringBuilder()
    for (i in 1..n) {
        val k = readLine().toInt()
        sb.append(arr[k]).append('\n')
    }
    print(sb.toString())
}