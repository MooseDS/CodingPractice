import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val rl = readLine()
    val st = StringTokenizer(rl)
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val arr = IntArray(n)
    val arl = readLine()
    val aSt = StringTokenizer(arl)
    for (i in 0..< n) {
        arr[i] = aSt.nextToken().toInt()
    }

    mergeSort(arr, 0, arr.size - 1, k)
    if (p < k) {
        println("-1")
    }
}

var p = 0
fun mergeSort(arr: IntArray, left: Int, right: Int, k: Int) {
    if (left < right) {
        val mid = (left + right) / 2
        mergeSort(arr, left, mid, k)
        mergeSort(arr, mid + 1, right, k)
        doMerge(arr, left, mid, right, k)
    }
}

fun doMerge(arr: IntArray, left: Int, mid: Int, right: Int, k: Int) {
    val tempArr = IntArray(right - left + 1)
    var i = left
    var j = mid + 1
    var t = 0

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            tempArr[t++] = arr[i++]
        } else {
            tempArr[t++] = arr[j++]
        }
    }

    while (i <= mid) {
        tempArr[t++] = arr[i++]
    }

    while (j <= right) {
        tempArr[t++] = arr[j++]
    }

    i = left
    t = 0
    while (i <= right) {
        arr[i++] = tempArr[t++]
        p++
        if (p == k) {
            println("${arr[i-1]}")
        }
    }
}




