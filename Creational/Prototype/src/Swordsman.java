/**
 * Classe filha de GameUnit que poderá ser clonada
 */
public class Swordsman extends GameUnit{
    private String state = "idle";

    public void attack(){
       this.state = "attack";
    }

    @Override
    protected void reset() {
        //Voltando o Swordsman para seu estado "padrão" para que ele possa ser clonado
        state = "idle";
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "state='" + state + '\'' +
                '}';
    }
}
