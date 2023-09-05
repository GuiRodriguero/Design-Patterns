package br.com.ex2;

public class TesteSimplesBuilder implements TesteBuilder{

    private String nome;
    private Material material;
    private ValorReferencia valorReferencia;
    private Teste teste;

    @Override
    public TesteBuilder withName(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public TesteBuilder withMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public TesteBuilder withValorReferencia(ValorReferencia valorReferencia) {
        this.valorReferencia = valorReferencia;
        return this;
    }

    @Override
    public Teste build() {
        return new Teste(nome, material, valorReferencia);
    }

    @Override
    public Teste getTeste() {
        return teste;
    }
}
