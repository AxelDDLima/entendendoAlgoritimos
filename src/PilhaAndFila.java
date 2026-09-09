import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class PilhaAndFila {
    static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();

        //inserir na pilha ( ultimo que entra, primeiro que sai)
        pilha.push("folha 1");
        pilha.push("folha 2");
        //ultimo a entrar
        pilha.push("folha 3");

        //retirar elemento
        String remove = pilha.pop();
        System.out.println(remove);
        remove = pilha.pop();
        System.out.println(remove);

        //Primeiro que entra, primeiro que sai
        Queue<String> fila = new ArrayDeque<>();
        //adicionar elemento
        fila.add("1 - Jick (primeiro a chegar)");
        fila.add("2 - Plin (segundo a chegar)");
        fila.add("3 - Jack (terceiro a chegar)");



        String elemento = fila.peek();
        System.out.println(elemento);
        elemento = fila.peek();
        System.out.println(elemento);
        //retirar elemento
        elemento = fila.poll();
        System.out.println(elemento);
        elemento = fila.poll();
        System.out.println(elemento);

    }
}
