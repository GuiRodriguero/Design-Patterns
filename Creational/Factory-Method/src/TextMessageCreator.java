/**
 * Implementação para que possamos criar classes TextMessage
 */
public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
