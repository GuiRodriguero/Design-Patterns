package br.com.ex1;

/**
 * Classe que representa o Receiver (quem de fato executa a ação quando o método execute() é chamado)
 */
public class EWSService {

    public void addMember(String contact, String contactGroup){
        System.out.println("Added " + contact + " to " + contactGroup);
    }
    public void removeMember(String contact, String contactGroup){
        System.out.println("Removed " + contact + " from " + contactGroup);
    }
}
