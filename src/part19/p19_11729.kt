package part19

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    hanoi(n, 1, 3, 2)
    println(cnt)
    print(sb.toString())
}

var cnt = 0
val sb = StringBuilder()
fun hanoi(n: Int, start: Int, to: Int, via: Int) {
    if (n == 1) move(1, start, to)
    else {
        hanoi(n - 1, start, via, to)
        move(n, start, to)
        hanoi(n - 1, via, to, start)
    }
}

fun move(n: Int, start: Int, to: Int) {
    cnt++
    sb.append("$start $to\n")
}