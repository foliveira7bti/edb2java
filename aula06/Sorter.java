package br.com.fernando.aula06;


public class Sorter {
    public void sort(int[] numeros) {
        mergeSort(numeros, 0, numeros.length-1);
    }

    private void mergeSort(int[] numeros, int inicio, int fim) {
        if (fim<=inicio){
            return;
        }
        int meio = Math.floorDiv(inicio+fim,2);

        mergeSort(numeros,inicio,meio);
        mergeSort(numeros,meio+1,fim);
        merge(numeros,inicio,meio,fim);
    }

    private void merge(int[] numeros, int inicio, int meio, int fim) {
        int tamanho1 = meio - inicio + 1;
        int tamanho2 = fim - meio;
        int[] aux1 = new int[tamanho1];
        int[] aux2 = new int[tamanho2];

        for (int i=0;i<tamanho1;++i)
        {
            aux1[i] = numeros[inicio+i];
        }

        for(int j=0;j<tamanho2;++j)
        {
            aux2[j] = numeros[meio+1+j];
        }

        int indice1 = 0;
        int indice2 = 0;
        int indiceprincipal = inicio;

        while(indice1 < tamanho1 && indice2 < tamanho2)
        {
            if(aux1[indice1]<aux2[indice2])
            {
                numeros[indiceprincipal] = aux1[indice1];
                indice1++;
            }
            else
            {
                numeros[indiceprincipal] = aux2[indice2];
                indice2++;
            }
            indiceprincipal++;
        }

        while(indice1<tamanho1)
        {
            numeros[indiceprincipal] = aux1[indice1];
            indiceprincipal++;
            indice1++;
        }

        while(indice2<tamanho2)
        {
            numeros[indiceprincipal] = aux2[indice2];
            indiceprincipal++;
            indice2++;
        }
    }
}
