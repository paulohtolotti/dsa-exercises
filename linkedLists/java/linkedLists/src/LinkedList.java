import linkedLists.Node;

public class LinkedList<T> {
    public Node<T> head;
    public Integer size = 0;

    public LiknedList() {
        this.head = null;
        this.size = 0;
    }

    public Integer getSize() {
        return this.size;
    }

    // Adição
    public void addAtStart(T data) {
        Node<T> newNode = new Node<T>(data);

        if (this.head == null) {
            this.head = newNode;

        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;

    }

    public void addAtEnd(T data) {
        Node<T> newNode = new Node<T>(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> pointer = this.head; // Não mexer no head, é uma referência fixa

            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }

            pointer.setNext(newNode);
            // Redudante, mas deixei explícito para indicar que o novo elemento vai no final
            newNode.setNext(null);
        }
        this.size++;
    }

    public void addAtPosition(int position, T data) {

        // Se a lista possui 4 posições, inserir na posição 5 é válida, mas não na 6
        if (position < 0 || this.isEmpty() && position > 0 || position > this.size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            this.addAtStart(data);
            return;
        }

        if (position == this.size - 1) {
            this.addAtEnd(data);
            return;
        }

        Node<T> newNode = new Node<T>(data);
        Node<T> aux = this.head;

        for (int i = 0; i < position - 1; i++) {
            aux = aux.getNext();
        }

        newNode.setNext(aux.getNext());
        aux.setNext(newNode);
        this.size++;
    }

    // O(N) -> busca simples
    public Integer getPosition(T data) {

        if (this.isEmpty()) {
            System.out.println("Empty list");
            return -1;
        }

        Node<T> pointer = this.head;
        int index = 0;

        for (int i = 0; i < this.size; i++) {
            if (pointer.getData().equals(data)) {
                return index;
            }
            index++;
            pointer = pointer.getNext();
        }

        return -1;
    }

    public Node<T> getElementByPosition(int position) {
        if (this.isEmpty()) {
            System.out.println("Empty list");
            return null;
        }

        if (position > this.size | position < 0) {
            System.out.println("Invalid position");
            return null;
        }

        Node<T> aux = this.head;
        for (int i = 0; i < position; i++) {
            aux = aux.getNext();
        }

        return aux;
    }

    // Deletar
    public void removeAt(int index) {

        if (this.isEmpty()) {
            System.out.println("Empty list. Can't remove.");
            return;
        }

        if(index < 0 | index > this.size) {
            System.out.println("Invalid index.");
            return;
        }

        if(index == 0) {
            this.head = head.getNext();
            this.size--;
            return;
        }

        Node<T> pointer = this.head;

        if(index == this.size - 1) {

            while(pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }

            pointer.setNext(null);
        } else {

            for(int i = 0; i < index - 1; i++) {
                pointer = pointer.getNext();
            }
            pointer.setNext(pointer.getNext().getNext());

        }
        this.size--;

    }
    
    public void removeElement(T element) {

        if(this.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        Node<T> aux = this.head;

        // Checa se o elemento está no topo
        if(aux.getData() == element) {
            this.head = aux.getNext();
            this.size--;
            return;
        }
 
        // Itera até o último elemento
        while(aux.getNext() != null) {

            if(aux.getNext().getData() == element) {
                aux.setNext(aux.getNext().getNext());
                this.size--;
                return;
            }
            aux = aux.getNext();
        }
 
        // Checa se o último elemento é o desejado
        if(aux.getData() == element) {
            aux = null;
            this.size--;
            return;
        }

        System.out.println("Elemento não presente na lista");
    }

    // Utils
    public boolean isEmpty() {
        return this.size == 0 ? true : false;
    }

    public boolean exists(T element) {
        return this.getPosition(element) == -1 ? false : true;
    }

    public void clean() {
        this.head = null;
        this.size = 0;
        System.out.println("cleaned!");
    }

    public void print() {

        if (this.isEmpty()) {
            System.out.println("Empty list");
        } else {
            Node<T> pointer = this.head;
            for (int i = 0; i < this.size; i++) {
                System.out.print(pointer.getData() + " -> ");
                pointer = pointer.getNext();
            }
            System.out.print(" null [END OF LIST]\n");
        }

    }
}
