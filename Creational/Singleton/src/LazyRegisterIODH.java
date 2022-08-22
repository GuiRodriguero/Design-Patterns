/**
 * Esta classe tem o intuito de demonstrar a criação de Singletons do tipo Lazy com uma classe Holder
 * Neste caso, como podemos ver, não temos uma checagem para saber se a instância é nula, mas isso não é um problema
 * pois a criação da instância só occore quando chamamos o método getInstance... então ainda podemos considerar
 * este cenário como uma Singleton Lazy
 */
public class LazyRegisterIODH {

    /**
     * Criamos um construtor privado para que não seja instanciado por outras classes
     */
    private LazyRegisterIODH(){
        System.out.println("Só aparece uma vez");
    }

    private static class RegisterHolder{
        static LazyRegisterIODH INSTANCE = new LazyRegisterIODH();
    }

    public static LazyRegisterIODH getInstance(){
        return RegisterHolder.INSTANCE;
    }
}
