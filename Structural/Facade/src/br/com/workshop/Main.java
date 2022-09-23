package br.com.workshop;

import br.com.ex2.CPU;
import br.com.ex2.HD;
import br.com.ex2.Memoria;

public class Main {
    public static void main(String[] args) {
        CPU cpu;
        Memoria memoria;
        HD hd;

        cpu = new CPU();
        memoria = new Memoria();
        hd = new HD();

        cpu.start();
        hd.read();
        memoria.load();
        cpu.execute();
        memoria.free();

    }
}
