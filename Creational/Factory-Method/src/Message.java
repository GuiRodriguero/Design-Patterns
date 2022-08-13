/**
 * Classe pai com métodos padrão para todas as classes que são "um tipo de" Message. Ex: JSONMessage é um tipo de Message
 */
public abstract class Message {
    public abstract String getContent();
    public void addDefaultHeaders(){

    }
    public void encrypt(){

    }
}
