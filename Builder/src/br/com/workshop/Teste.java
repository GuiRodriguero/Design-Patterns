package br.com.workshop;

public class Teste {
    private String nome;
    private Material material;
    private ValorReferencia valorReferencia;

    public Teste() {
    }

    public Teste(String nome, Material material, ValorReferencia valorReferencia) {
        this.nome = nome;
        this.material = material;
        this.valorReferencia = valorReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public ValorReferencia getValorReferencia() {
        return valorReferencia;
    }

    public void setValorReferencia(ValorReferencia valorReferencia) {
        this.valorReferencia = valorReferencia;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "nome='" + nome + '\'' +
                ", material=" + material +
                ", valorReferencia=" + valorReferencia +
                '}';
    }
}
