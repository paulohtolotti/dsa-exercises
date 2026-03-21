
import entities.DoublyNode;

public class DoublyLinkedList<T> {
    public DoublyNode<T> head;
    public DoublyNode<T> tail;
    public int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Inserção
    public void addAtStart(T content) {
        DoublyNode<T> node = new Node(content);

        if(this.isEmpty()) {
            this.addIfEmpty(node);
            return;
        }

        node.next = this.head;
        node.prev = null;
        this.head.prev = node;
        this.head = node;
        this.size++;
    }

    public void addAtEnd(T content) {

        DoublyNode<T> node = new Node(content);
        // Adiciona se a lista estiver vazia
        if(this.isEmpty()) {
            this.addIfEmpty(node);
            return;
        }

        node.prev = this.tail;
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    public void addAtPosition(T content, int position) {

        if(this.isEmpty()) {
            DoublyNode<T> newNode = new Node(content);
            this.addIfEmpty(newNode);
            return;
        }

        if(position < 0 || position > this.size) {
            System.out.println("Posição inválida");
            return;
        }

        if(position == 0) {
            this.addAtStart(content);
            return;
        }

        if(position == this.size) {
            this.addAtEnd(content);
            return;
        }

        DoublyNode<T> newNode = new Node(content);
        DoublyNode<T> previousNode = this.head;

        for(int i = 0; i < position - 1; i++) {
            previousNode = previousNode.next;
        }

        // Trocas
        newNode.next = previousNode.next;
        newNode.prev = previousNode;
        previousNode.next = newNode;
        newNode.next.prev = newNode;
        this.size++;
    }
    
    private void addIfEmpty(Node<T> node) {
        this.head = node;
        this.tail = node;
        this.size ++;
    }

    // Remoções
    public DoublyNode<T> removeHead() {

        if(this.isEmpty()) {
            System.out.println("Lista vazia");
            return null;
        }

        DoublyNode<T> node = this.head;
        this.head = this.head.next;

        if(this.head == null) {
            this.tail = null;
        } else {
            this.head.prev = null;
        }            
        this.size--;
        return node;
    }

    public DoublyNode<T> removeTail() {

        if(this.isEmpty()) {
            System.out.println("Lista vazia");
            return null;
        }

        DoublyNode<T> node = this.tail;
        this.tail = this.tail.prev;

        if(this.tail == null) {
            this.head = null;
        } else {
            this.tail.next = null;
        }

        this.size--;
        return node;
    }
    
    public DoublyNode<T> removeAt(int index) {

        if(this.isEmpty()) {
            System.out.println("Lista vazia.");
            return null;
        }

        if(index == 0) {
            return this.removeHead();
        }

        if(index == this.size - 1) {
            return this.removeTail();
        }

        DoublyNode<T> nodeToBeRemoved = this.findNode(index);
        DoublyNode<T> pointer = this.head;

        for(int i = 0; i < index - 1; i++) {
            pointer = pointer.next;
        }

        pointer.next = nodeToBeRemoved.next;
        nodeToBeRemoved.next.prev = pointer;
        this.size--;
        return nodeToBeRemoved;
    }
    
    public DoublyNode<T> removeNode(T element) {

        if(this.isEmpty()) {
            System.out.println("Lista vazia");
            return null;
        }

        int index = this.indexOf(element);

        if(index == -1) {
            return null;
        }
        return this.removeAt(index);
    }
    
    // Busca
    public DoublyNode<T> findNode(int index) {

        if(this.isEmpty() || index < 0 || index > this.size) {
            System.out.println("Operação inválida");
            return null;
        }

        DoublyNode<T> target = this.head;
        for(int i = 0; i < index; i++) {
            target = target.next;
        }

        return target;
    }
    
    // Utils
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public int indexOf(T data) {
        if(this.isEmpty()) {
            System.out.println("Lista vazia");
            return -1;
        }
        DoublyNode<T> pointer = this.head;
        for(int i = 0; i < this.size; i++) {
            if(pointer.data == data) return i;
            pointer = pointer.next;
        }

        System.out.println("Elemento " + data + " ausente");
        return -1;
    }
    
    public boolean contains(T data) {
        return this.indexOf(data) == - 1 ? false: true;
    }

    public void clean() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void print() {
    
        DoublyNode<T> pointer = this.head;

        while(pointer != null) {
            System.out.print(pointer.data + " <-> ");
            pointer = pointer.next;
        }
        System.out.print(" null\n");
    }

    public void reverse() {

        if(this.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        if(this.size == 1) {
            return;
        }

        // Captura as referêncais originais
        NoDoublyNodede<T> nodeHead = this.head;
        DoublyNode<T> nodeTail = this.tail;

        // Troca topo e cauda
        this.head = nodeTail;
        this.tail = nodeHead;

        // Inverte next e prev em todos os nods
        DoublyNode<T> current = nodeHead;
        DoublyNode<T> aux = null;

        while(current != null) {
            aux = current.next;
            current.next = current.prev;
            current.prev = aux;
            current = aux;
        }

    }
}
