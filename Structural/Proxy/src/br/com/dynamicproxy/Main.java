package br.com.dynamicproxy;

public class Main {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("Gui.jpg");
        img.setLocation("C:/Foto");
        System.out.println(img.getLocation());
        System.out.println("******************");
        img.render();
    }
}
