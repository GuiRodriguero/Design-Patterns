package br.com.ex2;

/**
 * Refined Abstraction (é a abstração mais especializada, é opcional nesse pattern)
 */
public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
