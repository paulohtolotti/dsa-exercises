/**
 * Implementação de uma pilha com tamanho fixo,
 * usando um array como base.
 */
public class StackArray{

    public int topIndex;
    public int size;
    public int[] content;

    public StackArray(int size) {

        this.topIndex = -1;
        this.size = size;
        this.content = new int[size];

    }

    public void push(int data) {

        if(isFull()) {
            System.out.println("Pilha cheia");
            return;
        }

        content[++topIndex] = data;
    }

    public int pop() {

        if(isEmpty()) {
            System.out.println("Pilha vazia");
            return -1;
        }
        
        int top = content[topIndex--];
        return top;
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Pilha vazia.");
            return -1;
        }

        return content[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1 ? true : false;
    }

    public int count() {
        return topIndex + 1;
    }
    public boolean isFull() {
        return topIndex == size -1 ? true : false;
    }
}