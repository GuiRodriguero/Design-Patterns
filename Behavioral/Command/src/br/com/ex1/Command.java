package br.com.ex1;

/**
 * br.com.ex1.Command -> armazena toda a informação necessária para se executar uma ação
 * (incluindo o método a ser chamado, seus argumentos, etc.)
 * Obs: essas informações ficam nas classes que implementam esta interface
 */
public interface Command {
    void execute();
}
