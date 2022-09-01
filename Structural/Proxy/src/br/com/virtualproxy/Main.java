package br.com.virtualproxy;

public class Main {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("Gui.jpg");
        img.setLocation("D:/");
        System.out.println(img.getLocation());

        System.out.println("Renderizando...");
        /*Nota-se que, ao chamar este método, estamos caindo no br.com.virtualproxy.ImageProxy#render
        que por sua vez, cria um br.com.virtualproxy.BitmapImage (objeto real ao invés do proxy)
        Sendo assim, logo que ele cria o objeto real, ele chama o construtor dele (que tem um sysout)
        E, pelo fato do render() do proxy chamar o render() do objeto real, ele printa outra informação na tela também
        */
        img.render();
    }
}
