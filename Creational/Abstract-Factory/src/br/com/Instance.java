package br.com;

/**
 * Representa um produto abstrato
 */
public interface Instance {
    void start();
    void attachStorage(Storage storage);
    void stop();
}
