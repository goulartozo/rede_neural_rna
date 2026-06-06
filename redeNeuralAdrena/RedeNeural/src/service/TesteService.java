package service;

import ADReNA_API.Data.DataSet;
import ADReNA_API.Data.DataSetObject;
import ADReNA_API.NeuralNetwork.Backpropagation;
import model.ResultadoTestes;

public class TesteService {

    public ResultadoTestes executarTeste(
            Backpropagation rede,
            DataSet dataSetTeste) throws Exception {

        int acertos = 0;
        int total = dataSetTeste.Length();

        /*
         * Matriz:
         *
         *           Previsto
         *         B   M   A
         *
         * Real B
         * Real M
         * Real A
         */
        int[][] matriz = new int[3][3];

        for (DataSetObject objeto : dataSetTeste.GetList()) {

            double[] saidaRede =
                    rede.Recognize(objeto.GetInput());

            int classePrevista =
                    obterIndiceMaior(saidaRede);

            int classeReal =
                    obterIndiceMaior(
                            objeto.GetTargetOutput());

            matriz[classeReal][classePrevista]++;

            if (classePrevista == classeReal) {
                acertos++;
            }
        }

        ResultadoTestes resultado =
                new ResultadoTestes();

        resultado.setTotal(total);
        resultado.setAcertos(acertos);
        resultado.setErros(total - acertos);
        resultado.setAcuracia(
                (acertos * 100.0) / total
        );
        resultado.setMatrizConfusao(matriz);

        return resultado;
    }

    private int obterIndiceMaior(double[] valores) {

        int indice = 0;

        for (int i = 1; i < valores.length; i++) {

            if (valores[i] > valores[indice]) {
                indice = i;
            }
        }

        return indice;
    }
}