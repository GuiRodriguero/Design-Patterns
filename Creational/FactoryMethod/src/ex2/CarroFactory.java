package ex2;

public class CarroFactory extends VeiculoFactory{
    @Override
    Veiculo instanciarVeiculo() {
        return new Carro();
    }
}
