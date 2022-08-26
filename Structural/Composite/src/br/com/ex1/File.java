package br.com.ex1;

/**
 * Esta classe reperesenta o Component no nosso UML do Composite pattern. É a classe base que define operações
 * para as leafs e a composite
 */
public abstract class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void ls();

    //Estes métodos abaixo poderia ficar só na classe Composite (Directory), pois as leafs não usam (Ver ex2)
    public abstract void addFile(File file);
    public abstract File[] getFiles();
    public abstract boolean removeFile(File file);

}
