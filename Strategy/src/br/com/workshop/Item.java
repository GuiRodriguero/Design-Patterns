package br.com.workshop;

public class Item {
    private String codigo;
    private int preco;

    public Item(String codigo, int preco){
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPreco() {
        return preco;
    }
}
