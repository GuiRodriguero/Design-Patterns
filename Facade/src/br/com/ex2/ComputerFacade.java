package br.com.ex2;

public class ComputerFacade {
    private CPU cpu;
    private Memoria memoria;
    private HD hd;

    private void criarComponentes(){
        cpu = new CPU();
        memoria = new Memoria();
        hd = new HD();
    }

    public void ligarComputador(){
        criarComponentes();
        cpu.start();
        hd.read();
        memoria.load();
        cpu.execute();
        memoria.free();
    }
}
