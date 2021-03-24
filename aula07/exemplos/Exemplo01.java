package exemplos;

import java.util.Stack;


public class Exemplo01 {
    public static void main(String[] args) {
        
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println("tamanho" + pilha.size());
        System.out.println("topo:" + pilha.peek());

        System.out.println("Removendo " + pilha.pop());
        System.out.println("Removendo "  +pilha.pop());
        System.out.println("Removendo " +pilha.pop());
        System.out.println("Removendo " + pilha.pop());

    }
    
}
