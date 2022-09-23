package br.com.workshop;

public class Material {
    private String nome;

    public Material() {
    }

    public Material(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
