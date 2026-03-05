import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    val size = s.length
    val rSet = hashSetOf<String>()

    for (i in 1..size) { 
        val end = size - i
        for (j in 0..end) {
            val p = s.substring(j, j + i)
            rSet.add(p)
        }
    }

    println(rSet.size)
}