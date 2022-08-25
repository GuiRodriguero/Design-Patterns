import java.util.Base64;

/**
 * Decorator para Base64
 */
public class Base64EncodedMessage implements Message{
    Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }
}
