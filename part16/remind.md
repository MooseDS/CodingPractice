# 스택, 큐, 덱

## 큐

~~~
class DynamicCircularQueue<T>(initialCapacity: Int = 4) {
    private var capacity = initialCapacity
    private var queue = arrayOfNulls<Any>(capacity)
    private var front = 0
    private var rear = 0
    private var size = 0

    fun isEmpty() = size == 0
    fun isFull() = size == capacity

    fun enqueue(item: T) {
        if (isFull()) {
            reallocate(capacity * 2)
        }
        queue[rear] = item
        rear = (rear + 1) % capacity
        size++
    }

    @Suppress("UNCHECKED_CAST")
    fun dequeue(): T? {
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
~~~