import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) {""}

    for(i in 0 until n) {
        arr[i] = readLine()
    }

    arr.sortWith{ o1, o2 -> 
        if (o1.length == o2.length) {
            o1.compareTo(o2)
        } else {
            o1.length - o2.length
        }
    }

    arr.distinct().forEach {
        println("$it")
    }
}
// sorted set -> tree set
// 