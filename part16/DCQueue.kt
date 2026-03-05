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

    fun addFirst(itme: T) {
        if (isFull()) reallocate(capacity * 2)
        front = (front - 1 + capacity) % capacity
        queue[front] = item
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

    @Suppress("UNCHECKED_CAST")
    fun removeFirst(): T? {
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
