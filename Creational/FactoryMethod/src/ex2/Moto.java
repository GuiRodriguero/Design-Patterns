package ex2;

public class Moto extends Veiculo{

    @Override
    public void montarVeiculo(Veiculo veiculo) {
        veiculo.setRodas(2);
    }
}
