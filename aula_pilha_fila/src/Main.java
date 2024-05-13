public class Main {
    public static void main(String[] args) {
        Fila queue = new Fila(5);

        System.out.println("Added"+queue.addFila("Um"));
        System.out.println("Added"+queue.addFila("2"));
        System.out.println("Added"+queue.addFila("1"));
        System.out.println("Added"+queue.addFila("24"));

        System.out.println("Esta vazia "+ queue.estaVazia());

        System.out.println("Primeiro elemento da fila"+ queue.primeiro());
        System.out.println("Tamanho da fila"+ queue.tamanho());


        System.out.println("Esta vazia "+ queue.estaVazia());

        Pilha stack = new Pilha(5);
        System.out.println("Added: " + stack.empilhar("um"));
        System.out.println("Added: " + stack.empilhar("dois"));
        System.out.println("Added: " + stack.empilhar("tres"));
        System.out.println("Added: " + stack.empilhar("quatro"));
        System.out.println("Added: " + stack.empilhar("cinco"));

        System.out.println("Vazia? " + stack.estaVazia());
        System.out.println("Topo " + stack.topo());
        System.out.println("Tamanho " + stack.tamanho());
        System.out.println("Removido " + stack.desempilhar());

    }
}