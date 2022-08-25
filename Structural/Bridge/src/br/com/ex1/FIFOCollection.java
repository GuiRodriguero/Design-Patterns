package br.com.ex1;

/**
 * First In First Out Collection
 * Esta classe é a nossa abstração
 * Quando falamos de abstração, não estamos falando necessariamente de classes abstratas ou interface. Estamos falando de métodos
 * que abstraem a complexidade da implementação do cliente (código que carrega a regra de negócio)
*/
public interface FIFOCollection<T> {
    void offer(T element);
    T poll();
}
