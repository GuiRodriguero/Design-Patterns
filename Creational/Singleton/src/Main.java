public class Main {
    public static void main(String[] args) {
        //EagerRegister eagerRegister = new EagerRegister(); ERRO POIS É SINGLETON (CONSTRUTOR PRIVADO)
        EagerRegister eagerRegister = EagerRegister.getInstance();
        EagerRegister eagerRegister2 = EagerRegister.getInstance();
        System.out.println(eagerRegister == eagerRegister2); //true

        LazyRegisterWithDLC lazyRegister = LazyRegisterWithDLC.getInstance();
        LazyRegisterWithDLC lazyRegister2 = LazyRegisterWithDLC.getInstance();
        System.out.println(lazyRegister == lazyRegister2); //true
    }
}
