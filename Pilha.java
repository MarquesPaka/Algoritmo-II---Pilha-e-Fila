import java.util.ArrayList;

public class Pilha {
    private ArrayList<String> elementos;

    // Construtor
    public Pilha() {
        elementos = new ArrayList<>();
    }

    // Inserir elemento no topo da pilha
    public void push(String item) {
        elementos.add(item);
    }

    // Remover elemento do topo
    public String pop() {
        if (!isEmpty()) {
            return elementos.remove(elementos.size() - 1);
        }
        return "Pilha vazia!";
    }

    // Consultar o topo da pilha
    public String peek() {
        if (!isEmpty()) {
            return elementos.get(elementos.size() - 1);
        }
        return "Pilha vazia!";
    }

    // Verificar se a pilha está vazia
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    // Mostrar elementos da pilha
    public void mostrarPilha() {
        System.out.println("Pilha: " + elementos);
    }

    public static void main(String[] args) {
        Pilha pl = new Pilha();

        pl.push("António");
        pl.push("Armando");
        pl.push("Janeta");
        pl.push("Azaiel");

        pl.mostrarPilha();

        System.out.println("Topo: " + pl.peek());
        System.out.println("Removido: " + pl.pop());
        System.out.println("Novo topo: " + pl.peek());
        System.out.println("Está vazia? " + pl.isEmpty());

        pl.mostrarPilha();
    }
}