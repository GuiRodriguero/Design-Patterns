package br.com.virtualproxy;

/**
 * Classe "RealObject" do pattern Proxy. Implementa a interface usada pelo Main
 * e só é usada quando realmente necessário
 */
public class BitmapImage implements Image{

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
