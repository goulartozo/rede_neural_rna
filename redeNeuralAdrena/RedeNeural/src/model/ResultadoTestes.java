package model;

public class ResultadoTestes
{
    private int total;
    private int acertos;
    private int erros;
    private double acuracia;

    private int[][] matrizConfusao;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public double getAcuracia() {
        return acuracia;
    }

    public void setAcuracia(double acuracia) {
        this.acuracia = acuracia;
    }

    public int[][] getMatrizConfusao() {
        return matrizConfusao;
    }

    public void setMatrizConfusao(int[][] matrizConfusao) {
        this.matrizConfusao = matrizConfusao;
    }
}