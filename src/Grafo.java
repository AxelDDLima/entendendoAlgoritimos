import java.util.*;

public class Grafo {
    //Estou com uma plantação de abacaxi, quero encontrar compradores de abacaxi! Vamos procurar na minha rede de amigos...
    static Map<String, List<String>> redeDeAmigos;

    static void main(String[] args) {
        Grafo grafo = new Grafo();
        /**
         * Curiosidades:
         * Vendedores de Abacaxi tem 1 ao final do nome.
         */
        //QUEM SOU EU?
        String eu = "Axel";
        //MAPEAR REDE DE AMIGOS
        grafo.popularRedeDeAmigos();
        //PEGAR A MINHA REDE DE AMIGOS GRAU 1
        Queue<String> fila = new LinkedList<>(redeDeAmigos.get(eu));
        //O COMPRADOR AINDA NÃO FOI ENCONTRADO - :/ :\ :| :(
        var compradorDeAbacaxiEncontrado = false;
        //SE EXISTEM AMIGOS EM COMUM, NÃO QUEREMOS PERGUNTAR A MESMA PESSOA 2 VEZES, NÃO É MESMO?
        //PORQUE PODERIAMOS ENTRA EM ‘LOOP’ INFINITO IURY DÁ O NOME DE PHILIPE, PHILIPE DA O NOME DE IURY.
        Set<String> amigosVerificados = new HashSet<>(); // O(1)

        while(!compradorDeAbacaxiEncontrado) {
            //PESQUISA EM LARGA ESCALA, PROCURAR NO MAIS PRÓXIMO
            var amigo = fila.poll();
            if (!amigosVerificados.contains(amigo)) {
                amigosVerificados.add(amigo);
                compradorDeAbacaxiEncontrado = amigo.contains("1");
                //SE ENCONTRAR O COMPRADOR, MOSTRAR QUEM É, E SAI.
                if (compradorDeAbacaxiEncontrado) {
                    System.out.println(amigo);
                    break;
                } else if (redeDeAmigos.get(amigo) != null && !redeDeAmigos.get(amigo).isEmpty()) { // SE AMIGO TIVER REDE, PEGAR REDE DO AMIGO.
                    fila.addAll(redeDeAmigos.get(amigo));
                } else if (fila.isEmpty()) {
                    System.out.println("Não existem comprador de abacaxi na rede de amigos!");
                    break;
                }
            }
        }
    }

    private void popularRedeDeAmigos() {
        redeDeAmigos = new HashMap<>();
        //Grau 1
        redeDeAmigos.put("Axel", List.of("Philipe", "Iury"));
        //Grau 2
        redeDeAmigos.put("Philipe", List.of("Mick", "Marolu", "Iury"));
        //Grau 2
        redeDeAmigos.put("Iury", List.of("Leticia", "Lindin", "Philipe"));
        //Grau 3
        redeDeAmigos.put("Mick", List.of("Faning1", "Pitoco"));
    }
}
