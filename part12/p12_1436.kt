import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) { 
    val n = readLine().toInt()
    var cnt = 0
    var name = 666
    while(cnt < n) {
        // val isfind = name.toString().contains("666")
        if (isFind(name)) {
            cnt++           
        }

        name++
    }     
    println(name - 1)
}

fun isFind(name: Int): Boolean {
    var temp = name
    while(temp >= 666) {
        if (temp % 1000 == 666) {
            return true
        } else {
            temp /= 10
        }
    }
    return false
}