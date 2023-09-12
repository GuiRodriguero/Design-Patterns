package ex1;

public class Main {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());

        /*
        Ao contrário do Simple-Factory, este Design Pattern é adequado até mesmo para cenários onde não sabemos que
        a quantidade de classes filhas irá crescer ou não, tendo em vista que, caso uma nova classe filha seja criada, a única
        coisa que precisamos fazeré criar uma nova classe que herde de MessageCreator
         */
    }

    public static void printMessage(MessageCreator creator){
        System.out.println(creator.getMessage());
    }
}
