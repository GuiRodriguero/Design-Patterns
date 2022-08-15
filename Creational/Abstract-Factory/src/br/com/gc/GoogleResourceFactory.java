package br.com.gc;

import br.com.Capacity;
import br.com.Instance;
import br.com.ResourceFactory;
import br.com.Storage;

/**
 * Classe que implementa a {@link ResourceFactory}. Irá criar as classes referente ao "set" da GoogleCloud
 */
public class GoogleResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
