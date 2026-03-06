import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val set = hashSetOf<String>()

    var cnt = 0
    for (i in 1..n) {
        val name = readLine()
        if (name == "ENTER") {
            set.clear()
        } else {
            if (!set.contains(name)) {
                set.add(name)
                cnt++
            }
        }
    }

    println(cnt)
}