package br.com.ex2;

public class ValorReferencia {
    private float valorMin;
    private float valorMax;

    public ValorReferencia() {
    }

    public ValorReferencia(float valorMin, float valorMax) {
        this.valorMin = valorMin;
        this.valorMax = valorMax;
    }

    public float getValorMin() {
        return valorMin;
    }

    public void setValorMin(float valorMin) {
        this.valorMin = valorMin;
    }

    public float getValorMax() {
        return valorMax;
    }

    public void setValorMax(float valorMax) {
        this.valorMax = valorMax;
    }

    @Override
    public String toString() {
        return "ValorReferencia{" +
                "valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                '}';
    }
}
