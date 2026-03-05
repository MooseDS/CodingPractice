class Node<T>(
    var value: T,
    var next: Node<T>? = null
)

class MyLinkedList<T> {
    private var head: Node<T>? = null

    fun append(value: T) {
        if (head == null) {
            head = Node(value)
            return
        }

        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = Node(value)
    }

    fun printAll() {
        var current = head
        val result = mutableListOf<T>()
        while (current != null) {
            result.add(current.value)
            current = current.next
        }
        println(result.joinToString(" -> "))
    }

    fun remove(value: T) {
        if (head?.value == value) {
            head = head?.next
            return 
        }

        // current?.next가 삭제될 노드로 만들기
        var current = head
        while (current?.next != null && current.next?.value != value) {
            current = current.next
        }
        current?.next = current?.next?.next
    }
}


class LinkedStack<T> {
    private var top: Node<T>? = null

    fun push(value: T) {
        val newNode = Node(value)
        newNode.next = top
        top = newNode
    }

    fun pop(): T? {
        val poppedValue = top?.value
        top = top?.next
        return poppedValue
    }

    fun peek(): T? = top?.value

    fun printStack() {
        var current = top
        val items = mutableListOf<T>()
        while (current != null) {
            items.add(current.value)
            current = current.next
        }
        println(items.joinToString(" -> ", prefix = "[Top] ", postfix = " [Bottom]"))
    }
}