/*
00 or 1

1개 - 1 (1)
2개 - 2
3개 - 3
4개 - 5
5개 - 8
6개 - 13
*/

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(1000001)
    arr[1] = 1
    arr[2] = 2
    for (i in 3..n) {
        arr[i] = (arr[i-1] + arr[i-2]) % 15746
    }
    println(arr[n])
}