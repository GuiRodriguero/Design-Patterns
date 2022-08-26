package br.com.ex1;

/**
 * Classe filha de {@link File}, representa uma 'leaf' no UML
 */
public class BinaryFile extends File{

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf não suporta a operação de addFile");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf não suporta a operação de getFiles");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf não suporta a operação de removeFile");
    }
}
