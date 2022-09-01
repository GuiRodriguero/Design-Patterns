package br.com.dynamicproxy;

import br.com.virtualproxy.Image;

/**
 * Classe concreta que provê a real funcionalidade do objeto
 */
public class BitmapImage implements Image {

    private String location;
    private String name;

    public BitmapImage(String name) {
        System.out.println("Loaded from disk: " + name);
        this.name = name;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered " + this.name);
    }
}
