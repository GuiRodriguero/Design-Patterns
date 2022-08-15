package br.com;

/**
 * Interface que representa o Abstract Factory (Aqui iremos fazer métodos que serão responsáveis por criar todas as classes
 * que temos nos nossos "sets". Neste caso, como cada set é formado por uma {@link Instance} e uma {@link Storage}, iremos
 * ter um método para criar cada uma
 */
public interface ResourceFactory {

    /**
     * Método responsável por criar e retornar uma classe filha de br.com.Instance. Quem vai decidir qual classe será criada
     * serão as implementações deste método
     */
    Instance createInstance(Capacity capacity);

    /**
     * Método responsável por criar e retornar uma classe filha de br.com.Instance. Quem vai decidir qual classe será criada
     * serão as implementações deste método
     */
    Storage createStorage(int capMib);
}
