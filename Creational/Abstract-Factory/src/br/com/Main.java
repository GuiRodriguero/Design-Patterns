package br.com;

import br.com.aws.AWSResourceFactory;
import br.com.gc.GoogleResourceFactory;

import static br.com.Capacity.LARGE;
import static br.com.Capacity.MICRO;

public class Main {

    private ResourceFactory factory;

    public Main(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createServer(Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
        Main aws = new Main(new AWSResourceFactory());
        Instance instance = aws.createServer(MICRO, 20480);
        instance.start();
        instance.stop();

        System.out.println("\n\n\n");

        Main gc = new Main(new GoogleResourceFactory());
        Instance gcInstance = gc.createServer(LARGE, 20480000);
        gcInstance.start();
        gcInstance.stop();
    }
}
