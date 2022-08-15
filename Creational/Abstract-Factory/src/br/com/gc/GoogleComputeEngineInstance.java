package br.com.gc;

import br.com.Capacity;
import br.com.Instance;
import br.com.Storage;

/**
 * Representa um produto concreto do "set" da GoogleCloud
 */
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute Engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }
}
