package br.com.ex2;

/**
 * Representa o nosso Implementor. Tem sua hierarquia própria (não se relacionando com a hierarquia da abstração ({@link Shape})
 * Esta classe provê operações que podem ser usadas pela nossa abstração para que ela entregue a funcionalidade dela
 */
public interface Color {
    String fill();
}
