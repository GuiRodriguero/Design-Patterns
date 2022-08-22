/**
 * Esta classe tem o intuito de demonstrar a criação de Singletons do tipo Eager
 * Eager -> Cria a instância no momento em que a classe é carregada (não esperamos que alguém peça pela instância
 */
public class EagerRegister {

    /**
     * Criamos um construtor privado para que não seja instanciado por outras classes
     */
    private EagerRegister(){

    }

    private static final EagerRegister INSTANCE = new EagerRegister();

    public static EagerRegister getInstance(){
        return INSTANCE;
    }
}
