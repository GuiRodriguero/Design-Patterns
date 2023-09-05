package br.com.ex2;

public abstract class Desconto {

    private Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    abstract double calcular(Pedido pedido);

    void setProximo(Desconto proximo){
        this.proximo = proximo;
    }

    Desconto getProximo(){
        return this.proximo;
    }
}
