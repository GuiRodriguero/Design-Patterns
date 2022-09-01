package br.com.virtualproxy;

/**
 * Classe que irá criar imagens. Ela é útil pois não queremos que o código alvo saiba
 * que ele está lidando com um proxy
 */
public class ImageFactory {
    /**
     * Estamos instanciando um proxy ao invés do objeto real, como já mencionado no Javadoc desse Factory
     */
    public static Image getImage(String name){
        return new ImageProxy(name);
    }
}
