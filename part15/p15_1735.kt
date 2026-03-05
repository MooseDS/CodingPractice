import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val fRl = readLine()
    val fSt = StringTokenizer(fRl)
    val sRl = readLine()
    val sSt = StringTokenizer(sRl)

    val a = fSt.nextToken().toInt()
    val b = fSt.nextToken().toInt()
    val c = sSt.nextToken().toInt()
    val d = sSt.nextToken().toInt()

    val child = a * d + c * b
    val parent = b * d
    val g = if (child > parent) gcd(child, parent) else gcd(parent, child)

    println("${child/g} ${parent/g}")
}

fun gcd (a: Int, b: Int):Int =
    if (b == 0) a else gcd(b, a%b)