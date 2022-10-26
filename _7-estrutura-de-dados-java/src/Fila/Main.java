package Fila;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.adicionar("João");
        fila.adicionar("Arthur");
        fila.adicionar("Patricia");
        fila.adicionar("Tetro");

        System.out.println("Primeiro da fila: "+fila.get());
        fila.remover();
        System.out.println("Novo primeiro da fila "+fila.get());
    }
}
