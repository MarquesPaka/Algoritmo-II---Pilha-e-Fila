import java.util.ArrayList;

public class Fila {
    private ArrayList<String> elementos;

    // Construtor
    public Fila() {
        elementos = new ArrayList<>();
    }

    // Inserir elemento na fila
    public void enqueue(String item) {
        elementos.add(item);
    }

    // Remover elemento da frente da fila
    public String dequeue() {
        if (!isEmpty()) {
            return elementos.remove(0);
        }
        return "Fila vazia!";
    }

    // Consultar o primeiro elemento
    public String front() {
        if (!isEmpty()) {
            return elementos.get(0);
        }
        return "Fila vazia!";
    }

    // Verificar se a fila está vazia
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    // Mostrar elementos da fila
    public void mostrarFila() {
        System.out.println("Fila: " + elementos);
    }

    public static void main(String[] args) {
        Fila fl = new Fila();

        fl.enqueue("Luis");
        fl.enqueue("Manuel");
        fl.enqueue("Marques");
        fl.enqueue("Adilson");
        fl.enqueue("Emiliano");

        fl.mostrarFila();

        System.out.println("Removido: " + fl.dequeue());
        System.out.println("Em frente: " + fl.front());
        System.out.println("Removido: " + fl.dequeue());
        System.out.println("Em frente: " + fl.front());
        System.out.println("Está vazia? " + fl.isEmpty());

        fl.mostrarFila();
    }
}