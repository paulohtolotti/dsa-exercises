public class App {
    public static void main(String[] args) throws Exception {

        StackArray pilha = new StackArray(5);

        pilha.push(1);
        pilha.push(5);
        pilha.push(7);
        pilha.push(19);

        pilha.push(75);
        pilha.pop();
        System.out.println("Nº elementos: " + pilha.count());
    }
}
