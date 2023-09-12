package ex1;

/**
 * Esta classe é o nosso Creator.
 */
public abstract class MessageCreator {
    public Message getMessage(){
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    /**
     * Este método deve ser herdado pelas classes filhas para dizer qual Classe será criada quando este método for chamado
     * Ex: Se chamarmos o createMessage da JSONMessageCreator, será criado um JSONMessage
     */
    public abstract Message createMessage();
}
