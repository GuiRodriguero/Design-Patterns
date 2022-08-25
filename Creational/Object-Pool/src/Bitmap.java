/**
 * Objeto concreto reusável
 * Vamos fazer o pool deste objeto para ter alguns objetos em reserva para caso alguém queria usar
 */
public class Bitmap implements Image{

    private String location;
    private String name;

    public Bitmap(String name){
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " @ " + location);
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocaion(String locaion) {
        this.location = locaion;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmat resetado");
    }
}
