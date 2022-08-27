public class Main {
    public static void main(String[] args) {
        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GENERIC_SYSTEM_ERROR);
        /*Logo abaixo estamos passando o estado extrínseco para a SystemErrorMessage. que irá usá-lo em conjunto com
        o estado intrínseco para gerar o nosso retorno desejado.
        Obs: O estado intrínseco foi criado no construtor privado da ErrorMessageFactory
        */
        System.out.println(msg1.getText("1122"));

        System.out.println("\n");

        //Usando Flyweight não compartilhado
        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("3344");
        System.out.println(msg2.getText(null));
    }
}
