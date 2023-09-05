package br.com.workshop;


public class Main {
    public static void main(String[] args) {
        /*
         *  Criar ComputerFacade. Nela, devemos ter os atributos (cpu, memoria, hd) declarados.
         *  1 método criarComponentes para instanciar estes atributos
         *  1 método ligarComputador para realizar o passo a passo de inicialização do computador
         */

        //Atributos
        CPU cpu;
        Memoria memoria;
        HD hd;

        //instanciando
        cpu = new CPU();
        memoria = new Memoria();
        hd = new HD();

        //inicializando
        cpu.start();
        hd.read();
        memoria.load();
        cpu.execute();
        memoria.free();

    }
}
