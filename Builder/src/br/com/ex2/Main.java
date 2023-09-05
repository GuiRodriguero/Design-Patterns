package br.com.ex2;

public class Main {
    public static void main(String[] args) {
        TesteBuilder builder = new TesteSimplesBuilder();
        Teste teste = directBuild(builder);
        System.out.println(teste);
    }
    private static Teste directBuild(TesteBuilder builder){
        Material material = new Material("Soro");
        ValorReferencia vr = new ValorReferencia(70, 150);
        return builder
                .withName("Glicose")
                .withMaterial(material)
                .withValorReferencia(vr)
                .build();
    }
}
