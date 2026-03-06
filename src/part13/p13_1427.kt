import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val size = rl.length
    val arr = IntArray(size, {0})
    for (i in 0 until size) {
        arr[i] = rl[i].code - 48
    }
    arr.sort()
    var j = size - 1
    while(j >= 0) {
        print(arr[j])
        j--
    }

    // selection sort 해도 100 이므로 nlogn 이랑 차이 없다
}
