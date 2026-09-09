import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {
    static void main(String[] args) {
        //estou com uma plantação de abacaxi, quero encontrar compradores de abacaxi! Vamos procurar na minha rede de amigos...
        Map<String, List<String>> redeDeAmigos = new HashMap<>();
        //Grau 1
        redeDeAmigos.put("Axel", List.of("João", "Maria"));
        //Grau 2
        redeDeAmigos.put("João", List.of("Mick", "Marolu"));
        //Grau 2
        redeDeAmigos.put("Maria", List.of("Leticia", "Lindin"));
        //Grau 3
        redeDeAmigos.put("Mick", List.of("Faning", "Pitoco"));

    }
}
