package ex1;

/**
 * Implementação para que possamos criar classes JSONMessage
 */
public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
