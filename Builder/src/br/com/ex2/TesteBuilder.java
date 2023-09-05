package br.com.ex2;

public interface TesteBuilder {
    TesteBuilder withName(String nome);
    TesteBuilder withMaterial(Material material);
    TesteBuilder withValorReferencia(ValorReferencia valorReferencia);

    Teste build();
    Teste getTeste();
}
