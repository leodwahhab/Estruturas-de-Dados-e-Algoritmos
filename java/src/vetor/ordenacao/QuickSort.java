package vetor.ordenacao;

public class QuickSort {
    public double[] dados = new double[10];

    void quickSort(double[] dados, int posInicio, int posFim) {
        if (posInicio < posFim) {
            int pivo = partition(posInicio, posFim);
            quickSort(dados, posInicio, pivo - 1);
            quickSort(dados, pivo + 1, posFim);
        }
    }

    int partition(int posInicio, int posFim) {
        double pivo = dados[posFim];
        int i = (posInicio - 1);

        for (int j = posInicio; j < posFim; j++) {
            if (dados[j] < pivo) {
                i++;

                double temp = dados[i];
                dados[i] = dados[j];
                dados[j] = temp;
            }
        }

        double temp = dados[i + 1];
        dados[i + 1] = dados[posFim];
        dados[posFim] = temp;

        return i + 1;
    }


}
