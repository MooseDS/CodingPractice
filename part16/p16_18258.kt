import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val que = DCQueue<Int>()
    // add, poll, size, isEmpty, first, last
    val n = readLine().toInt()
    val sb = StringBuilder()
    for (i in 1..n) {
        val rl = readLine()
        val st = StringTokenizer(rl)
        val next = st.nextToken()
        when(next) {
            "push" -> {
                val elem = st.nextToken().toInt()
                que.push(elem)
            }
            "pop" -> {
                val elem = que.pop()
                if (elem == null) {
                    sb.append("-1\n")
                } else {
                    sb.append("${elem}\n")
                }
            }
            "size" -> {
                sb.append("${que.getSize()}\n")
            }
            "empty" -> {
                if (que.isEmpty()) {
                     sb.append("1\n")
                } else {
                     sb.append("0\n")
                }
            }
            "front" -> {
                if (que.front() == null) {
                    sb.append("-1\n")
                } else {
                    sb.append("${que.front()}\n")
                }
            }
            "back" -> {
                if (que.back() == null) {
                    sb.append("-1\n")
                } else {
                    sb.append("${que.back()}\n")
                }
            }
        }
    }

    print(sb)
}

class DCQueue<T>(initialCapacity: Int = 4) {
    private var capacity = initialCapacity
    private var queue = arrayOfNulls<Any>(capacity)
    private var front = 0
    private var rear = 0
    private var size = 0

    fun isEmpty() = size == 0
    fun isFull() = size == capacity

    fun push(item: T) {
        if (isFull()) {
            reallocate(capacity * 2)
        }
        queue[rear] = item
        rear = (rear + 1) % capacity
        size++
    }

    @Suppress("UNCHECKED_CAST")
    fun pop(): T? {
        if (isEmpty()) return null

        val item = queue[front] as T
        queue[front] = null
        front = (front + 1) % capacity
        size--

        if (size > 0 && size <= capacity / 4 && capacity / 2 >= 4) {
            reallocate(capacity / 2)
        }
        return item
    }

    fun getSize(): Int {
        return size
    }

    @Suppress("UNCHECKED_CAST")
    fun front(): T? {
        if (size > 0) {
            val item = queue[front] as T
            return item
        }
        else return null
    }

    @Suppress("UNCHECKED_CAST")
    fun back(): T? {
         if (size > 0) {
            val index =  (rear - 1 + capacity) % capacity
            val item = queue[index] as T
            return item
        }
        else return null
    }

    private fun reallocate(newCapacity: Int) {
        val newQueue = arrayOfNulls<Any>(newCapacity)

        for (i in 0 until size) {
            newQueue[i] = queue[(front + i) % capacity]
        }

        queue = newQueue
        front = 0
        rear = size
        capacity = newCapacity
    }
}
