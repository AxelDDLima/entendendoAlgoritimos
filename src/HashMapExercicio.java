import java.util.HashMap;

public class HashMapExercicio {
    public int cauntString(String palavra){

        int[] valores = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101
        };

        int soma = 0;

        for(char letra : palavra.toCharArray()){
            System.out.println(letra);

            soma += valores[letra - 'a'];

        }
        return soma%10;
    }
}
