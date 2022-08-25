public class Main {
    public static void main(String[] args) {
        Message m = new TextMessage("Mensagem");
        System.out.println(m.getContent());

        System.out.println("\n");

        //Usando decorator
        Message decorator = new ToUpperEncodedMessage(m);
        System.out.println(decorator.getContent());

        System.out.println("\n");
        //Usando mais um decorator (passando um objeto que já foi decorado)
        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }
}
