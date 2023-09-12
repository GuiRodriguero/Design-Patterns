package ex2;

public abstract class VeiculoFactory {
    public Veiculo criar() {
        Veiculo veiculo = instanciarVeiculo();
        veiculo.montarVeiculo(veiculo);
        return veiculo;
    }

    abstract Veiculo instanciarVeiculo();
}
