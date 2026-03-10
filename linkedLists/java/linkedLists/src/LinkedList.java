
public class LinkedList<T> {

    private Node<T> head;
    private Integer size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Adiciona um novo node ao final da lista.
     * @param element chave do novo node
     */
    public void addAtEnd(T element) {

        Node<T> node = new Node(element);

        if(this.head == null) {
            this.head = node;
        } 
        else {
            Node<T> pointer = this.head;
            while(pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setNext(null);
        }

        this.size++;
    }

    public void print() {
        Node<T> pointer = this.head;

        while(pointer.getNext() != null) {
            System.out.print(pointer.getData() + " => ");
            pointer = pointer.getNext();
        }
        System.out.print(pointer.getData() + " => ");
        System.out.print(" null\n");
    }
}
