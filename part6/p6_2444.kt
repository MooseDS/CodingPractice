import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val max = 2 * n - 1
    for (i: Int in 1..max) {
        val abs = Math.abs(n - i)   // 빈칸수
        val star = (n-abs-1) * 2 + 1 // star수
        for (j: Int in 1..abs) {
            print(" ")            
        }
        for (j: Int in 1..star) {
            print("*")
        }
        println("")
    }
}

/*
for (i: Int in 1..max) {
        val abs = n - Math.abs(n - i) - 1
        val left =  n - abs 
        val right = n + abs
        for (j: Int in 1..max) {
            if (j >= left && j <= right) {
                print("*")
            } else {
                print(" ")
            }
        }
        println("")
    }
 */