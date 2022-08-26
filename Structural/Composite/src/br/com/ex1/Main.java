package br.com.ex1;

public class Main {
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.ls();

        System.out.println("\n**********\n");

        File root2 = createTreeTwo();
        root2.ls();
    }

    private static File createTreeOne(){
        File file1 = new BinaryFile("File 1", 1000);
        Directory d1 = new Directory("dir1");
        d1.addFile(file1);

        File file2 = new BinaryFile("File 2", 2000);
        File file3 = new BinaryFile("File 3", 500);
        Directory d2 = new Directory("dir1");
        d2.addFile(file2);
        d2.addFile(file3);
        d2.addFile(d1);

        return d2;
    }

    private static File createTreeTwo(){
        return new BinaryFile("Another File", 200);
    }

}
