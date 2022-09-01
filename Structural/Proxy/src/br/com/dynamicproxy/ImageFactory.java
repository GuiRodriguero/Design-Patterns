package br.com.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Mesma ideia da {@link br.com.virtualproxy.ImageFactory}
 */
public class ImageFactory {
    public static Image getImage(String name){
        //newProxyInstance pede um classLoader, um conjunto de classes que a classe do objeto real implementa e o nosso Proxy
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] {Image.class}, new ImageInvocationHandler(name));
    }
}
