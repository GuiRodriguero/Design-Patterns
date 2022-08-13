/**
 * Para fins de demonstração, iremos fazer com que General não possa ser duplicado (Mesmo sendo filho de GameUnit)
 */
public class General extends GameUnit{
    private String state;

    public void boostMorale(){
        state = "Moral Boost";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        //Não iremos permitir que o General seja clonado
        throw new CloneNotSupportedException("General is Unique");
    }

    @Override
    protected void reset() {
        //Como ele não será clonado, também não iremos permitir que resetem seu valor
        throw new UnsupportedOperationException("General is Unique");
    }
}
