package ex2;

public abstract class Veiculo {
    private int rodas;

    public int getRodas() {
        return this.rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    abstract void montarVeiculo(Veiculo veiculo);

    @Override
    public String toString() {
        return "Veiculo{" +
                "rodas=" + rodas +
                '}';
    }
}
