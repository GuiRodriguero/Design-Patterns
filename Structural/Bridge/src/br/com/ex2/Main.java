package br.com.ex2;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new Red());
        System.out.println(square.draw());

        Shape square1 = new Square(new Blue());
        System.out.println(square1.draw());
    }
}
