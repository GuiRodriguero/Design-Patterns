package ex2;

public class Carro extends Veiculo {

    @Override
    public void montarVeiculo(Veiculo veiculo) {
        veiculo.setRodas(4);
    }
}
