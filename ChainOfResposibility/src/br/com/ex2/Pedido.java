package br.com.ex2;

public class Pedido {
    private int quantidade;
    private double valor;

    public Pedido() {
    }

    public Pedido(int quantidade, int valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
