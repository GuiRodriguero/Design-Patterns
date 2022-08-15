package br.com.aws;

import br.com.Capacity;
import br.com.Instance;
import br.com.ResourceFactory;
import br.com.Storage;

/**
 * Classe que implementa a {@link ResourceFactory}. Irá criar as classes referente ao "set" da AWS
 */
public class AWSResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
