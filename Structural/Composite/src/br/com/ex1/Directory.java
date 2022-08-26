package br.com.ex1;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File{

    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() { //Aqui quermos chamar a operação ls em todos os filhos de File
        System.out.println(getName());
        children.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    @Override
    public boolean removeFile(File file) {
        return children.remove(file);
    }
}
