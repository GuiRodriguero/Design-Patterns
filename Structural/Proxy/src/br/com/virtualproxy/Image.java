package br.com.virtualproxy;

/**
 * Interface implementada pelo proxy e pelo objeto real
 */
public interface Image {

    void setLocation(String location);
    String getLocation();
    void render();
}
