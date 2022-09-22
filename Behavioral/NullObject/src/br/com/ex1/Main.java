package br.com.ex1;

public class Main {
    public static void main(String[] args) {
        ComplexService service = new ComplexService("Simple report 2",new NullStorageService());
        service.generateReport();
    }
}
