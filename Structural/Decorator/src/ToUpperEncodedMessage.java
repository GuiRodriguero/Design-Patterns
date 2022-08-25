/**
 * Decorator que transformará a mensagem em upper case (aqui a ideia é fazer o getContent (igual o client fazia normalmente) e
 * tratar ele do jeito que quisermos)
 */
public class ToUpperEncodedMessage implements Message{

    Message message;

    public ToUpperEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent().toUpperCase();
    }
}
