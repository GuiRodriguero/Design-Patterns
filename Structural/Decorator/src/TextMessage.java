/**
 * Objeto que será "decorado"
 */
public class TextMessage implements Message{

    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return msg;
    }
}
