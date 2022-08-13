/**
 * Classe que representa uma unidade militar em nosso sistema
 */
public abstract class GameUnit implements Cloneable {
    private String name;

    public GameUnit() {
    }

    public GameUnit(String name) {
        this.name = name;
    }

    /**
     * Como podemos ler no próprio java docs da interface Cloneable, classes que não implementam ela e tentam fazer o clone recebem
     * a exceção CloneNotSupportedException... Por convenção mudamos a visibilidade deste método para public
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        //Fazendo a shallow copy (olhar .md para explicação)
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    /**
     * Antes de retornarmos o objeto clonado, precisamos resetá-lo, ou seja, deixar todas os atributos desta
     * classe criados, porém "zerados"
     */
    private void initialize() {
        this.name = "";
        reset();
    }

    /**
     * Segue a mesma proposta do initialize, porém este método é usado nas classes filhas para que elas possam fazer a mesma coisa
     */
    protected abstract void reset();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
