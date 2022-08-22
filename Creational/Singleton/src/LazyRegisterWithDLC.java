/**
 * Esta classe tem o intuito de demonstrar a criação de Singletons do tipo Lazy
 * Lazy -> Não criamos a instância a não ser que alguém a peça
 */
public class LazyRegisterWithDLC {

    /**
     * Criamos um construtor privado para que não seja instanciado por outras classes
     */
    private LazyRegisterWithDLC(){

    }

    //volatile -> Faz com que o valor de leitura/escrita seja referente à memória principal (não ao cache)
    private static volatile LazyRegisterWithDLC INSTANCE;

    public static LazyRegisterWithDLC getInstance(){
        if(INSTANCE == null){
            synchronized (LazyRegisterWithDLC.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyRegisterWithDLC();
                }
            }
        }
        return INSTANCE;
    }
}
