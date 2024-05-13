public class Fila {

    private Object [] elementos;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    public Fila (int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = capacidade-1;
    }
    public Object addFila (Object elemento){
        if (tamanho == capacidade)
            throw new IllegalStateException("Fila cheia.");
        fim++;
        elementos[inicio] = elemento;
        tamanho++;
        return elemento;
    }
    public Object remover (){
        if(tamanho ==0)
            throw new IllegalStateException("Fila vazia!");
        Object removido = elementos[inicio];
        inicio++;
        tamanho--;
        return removido;
    }
    public Object primeiro() {
        if (tamanho == 0)
            throw new IllegalStateException("A fila está vazia");
        return elementos[inicio];
    }
    public boolean estaVazia () {
        if(tamanho == 0)
            return true;
        return false;
    }
    public int tamanho(){
        return tamanho;
    }
}
