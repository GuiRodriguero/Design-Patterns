package br.com.virtualproxy;

/**
 * Classe que iremos de fato fazer o virtual prox, ou seja, iremos lidar com
 * esse objeto o máximo de tempo possível, e só criaremos o RealObject {@link BitmapImage}
 * quando necessário. Na classe abaixo, por exemplo, só é criado quando queremos renderizar a imagem
 */
public class ImageProxy implements Image{

    private String name;
    private String location;
    private BitmapImage image;

    public ImageProxy(String name){
        this.name = name;
    }

    @Override
    public void setLocation(String location) {
        if(image != null){ //Verifica se o RealObject já foi criado. Se sim, já seta direto nele
            image.setLocation(location);
        }else{
            this.location = location;
        }
    }

    /**
     * Aqui fazemos a mesma lógica do set. Se o Objeto real não foi criado, retornamos o que
     * está cacheado no proxy
     */
    @Override
    public String getLocation() {
        return image != null ? image.getLocation() : location;
    }

    @Override
    public void render() {
        if(image == null){
            image = new BitmapImage(name);
            if(location != null){
                image.setLocation(location);
            }
        }
        image.render();
    }
}
