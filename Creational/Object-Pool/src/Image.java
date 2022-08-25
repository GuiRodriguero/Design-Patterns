/**
 * Interface do nosso objeto reusável
 */
public interface Image extends Poolable{
    void draw();
    String getLocation();
    void setLocaion(String locaion);
}
