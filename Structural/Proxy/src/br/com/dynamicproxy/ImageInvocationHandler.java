package br.com.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Aqui teremos o código do nosso proxy
 */
public class ImageInvocationHandler implements InvocationHandler {

    private String filename;
    private String location;
    private BitmapImage image;
    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    //Para não fazer uma instância de cada método durante o invoke, criamos variáveis estáticas com os métodos
    static {
        try {
            setLocationMethod = Image.class.getMethod("setLocation", new Class[]{String.class});
            getLocationMethod = Image.class.getMethod("getLocation", null);
            renderMethod = Image.class.getMethod("render", null);
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public ImageInvocationHandler(String filename) {
        this.filename = filename;
    }

    /**
     * Ao invés de fazer 3 métodos igual fizemos no nosso proxy estático {@link br.com.virtualproxy.ImageProxy}
     * onde cada método dizia o que seria feito caso o objeto real ainda não tinha sido criado, implementamos
     * o InvocationHandler e agora temos que herdar somente este único método.
     * Ou seja, esse método nada mais é do que a lógica do nosso proxy "o que fazer quando chamo o método x? crio o
     * objeto real ou uso o proxy?"
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //primeiro identificamos qual método está sendo chaamdo
        System.out.println("Método invocado: " + method.getName());
        if(method.equals(setLocationMethod)) {
            return handleSetLocation(args);
        } else if(method.equals(getLocationMethod)) {
            return handleGetLocation();
        } else if(method.equals(renderMethod)) {
            return handleRender();
        }
        return null;
    }

    //We create real object only when we really need it
    private Object handleRender() {
        if(image == null) {
            image = new BitmapImage(filename);
            if(location != null) {
                image.setLocation(location);
            }
        }
        image.render();
        return null;
    }

    private String handleGetLocation() {
        if(image != null) {
            return image.getLocation();
        } else {
            return this.location;
        }
    }

    private Object handleSetLocation(Object[] args) {
        if(image != null) {
            image.setLocation((String) args[0]);
        } else {
            this.location = (String) args[0];
        }
        return null;
    }

}
