import java.util.HashMap;
import java.util.List;

public class Main {
    static void main(String[] args) {
        FuncoesRecrusao recursao = new FuncoesRecrusao();
        PesquisaBinaria pesquisaBinaria = new PesquisaBinaria();
        HashMapExercicio hash = new HashMapExercicio();

        // ARRAY TEM UM NUMERO FIXO E USA TIPO PRIMITIVO
        int[] numeros = {1, 5, 4, 10};
        int[] binaria = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // LISTA TEM UM TAMANHO VARIAVÉL E ULTILIZA OBJETO COMO TIPO
        List<Integer> numeros3 = List.of(10, 30, 1, 7, 2);
        // HASHMAP TEM UM TAMANHO VARIAVÉL E ULTILIZA OBJETO COMO TIPO
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("Axel", 12 );
        mapa.put("Bob", 2 );

        System.out.println(mapa.get("Bob"));

        System.out.println("soma dos num : " +recursao.exercicio1Soma(numeros, 0));
        System.out.println("quantidade de num : " +recursao.exercicio2ContarItens(numeros, 0));
        System.out.println("maior num : " +recursao.exercicio2EncontarMaiorNum(numeros3, 0));
        System.out.println("indice : " + pesquisaBinaria.exercicioBuscaBinaria(binaria, 5, 0, binaria.length-1));

        //recursao.exercicioContar(10);

        System.out.println(hash.cauntString("dog"));
    }
}
