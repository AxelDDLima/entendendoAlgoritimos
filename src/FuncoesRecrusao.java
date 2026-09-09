import java.util.List;

public class FuncoesRecrusao {
    /**
     * soma todos os numeros do array
     *
     * @param numeros
     * @param indice
     * @return soma
     */
    public int exercicio1Soma(int[] numeros, int indice){

        //parada ou caso base
        if(indice==numeros.length){
            return 0;
        }

        //recursão ou continuar chamando a mesma função
        return numeros[indice] + exercicio1Soma(numeros, indice + 1);
    }

    /**
     * contar quantidade de itens
     *
     * @param numeros
     * @param indice
     * @return quantidade de itens
     */
    public int exercicio2ContarItens(int[] numeros, int indice){

        //parada ou caso base
        if(indice==numeros.length){
            return 0;
        }

        //recursão ou continuar chamando a mesma função
        return 1 + exercicio2ContarItens(numeros, indice + 1);
    }

    /**
     * contar quantidade de itens
     *
     * @param numeros
     * @param indice
     * @return quantidade de itens
     */
    public int exercicio2EncontarMaiorNum(List<Integer> numeros, int indice){

        //parada ou caso base
        if(indice==numeros.size()-1){
            return numeros.get(indice);
        }

        //pega indice maior num
        int maiorNum = exercicio2EncontarMaiorNum(numeros, indice + 1);

        //recursão ou continuar chamando a mesma função
        return Math.max(numeros.get(indice), maiorNum);
    }

    /**
     * contar quantidade de itens
     *
     * @param numeroContar
     * @return quantidade de itens
     */
    public int exercicioContar(int numeroContar){

        //parada ou caso base
        if(numeroContar<1){
            return 0;
        }

        System.out.println(numeroContar);

        //recursão ou continuar chamando a mesma função
        return exercicioContar(numeroContar-1);
    }

}
