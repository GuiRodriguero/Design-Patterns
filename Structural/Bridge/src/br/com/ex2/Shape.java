package br.com.ex2;

/**
 * Esta classe é a nossa abstração
 */
public abstract class Shape {

    //Aqui temos a composição que caracteriza a bridge. Essa é a ponte entre a abstração (Shape) e a interface (Color)
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
