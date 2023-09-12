package ex2;

public class MotoFactory extends VeiculoFactory{
    @Override
    Veiculo instanciarVeiculo() {
        return new Moto();
    }
}
