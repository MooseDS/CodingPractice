import java.io.BufferedReader

fun main() = with(System.`in`.bufferedReader()) {
    
    while(true) {
        val n = readLine().toInt()
        if (n == -1) {
            break
        }

        var sum = 0
        val sb = StringBuilder()
        for (i in 2..n) {
            val m = n / i
            if (m > 0 && n % i == 0) {
                sum += m
                if (m > 1) {
                    sb.insert(0, " + ${m}")
                } else {
                    sb.insert(0, " = 1")
                }
            }
        }

        if (n == sum) {
            println("${n}${sb.toString()}")
        } else {
            println("${n} is NOT perfect.")
        }

    }
}