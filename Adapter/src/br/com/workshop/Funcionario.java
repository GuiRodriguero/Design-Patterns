package br.com.workshop;

/**
 * Classe que tem a funcionalidade que queremos, porém não implementa a classe que o código alvo exige
 *
 * Aqui temos algumas diferenças em relação a interface alvo ({@link Cliente}), porém temos alguns atributos que
 * podem ser substitutos diretos, como:
 * nomeCompleto -> nome
 * localEscritorio -> endereco
 */
public class Funcionario {

    private String nomeCompleto;
    private String localEscritorio;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getLocalEscritorio() {
        return localEscritorio;
    }

    public void setLocalEscritorio(String localEscritorio) {
        this.localEscritorio = localEscritorio;
    }
}
