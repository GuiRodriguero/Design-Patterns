package br.com.workshop;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memoria memoria = new Memoria();
        HD hd = new HD();

        cpu.start();
        hd.read();
        memoria.load();
        cpu.execute();
        memoria.free();

    }
}
