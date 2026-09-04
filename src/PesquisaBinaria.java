public class PesquisaBinaria {
    /**
     * busca um numero dentro do array
     *
     * @param numeros
     * @param procurado
     * @param baixo
     * @param alto
     * @return soma
     */
    public int exercicioBuscaBinaria(int[] numeros, int procurando, int baixo, int alto){

        //parada ou caso base - intervalo invalido
        if(baixo > alto){
            return -1;
        }

        int meio = (baixo + alto)/2;

        //caso base encontrou
        if (numeros[meio] == procurando){
            return meio;
        }

        //recursão metade esquerda
        if (procurando < numeros[meio]){
            return exercicioBuscaBinaria(numeros, procurando, meio - 1, alto);
        }

        //recursão metade direita
        return exercicioBuscaBinaria(numeros, procurando, meio + 1, alto);
    }

}
