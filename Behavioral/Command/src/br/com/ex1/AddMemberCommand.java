package br.com.ex1;

/**
 * Implementação de Commnand. Aqui devemos ter tudo que precisamos para fazer o execute()
 */
public class AddMemberCommand implements Command{

    private String emailAddress;
    private String listName;

    private EWSService receiver;

    public AddMemberCommand(String emailAddress, String listName, EWSService receiver) {
        this.emailAddress = emailAddress;
        this.listName = listName;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }
}
