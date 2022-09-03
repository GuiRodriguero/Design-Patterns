package br.com.ex1WithBuilder;

import java.time.LocalDate;

/**
 * Aqui temos a implementação do pattern de Chain of Responsibility. Para realizar a criação do {@link LeaveApplication},
 * optei por utilizar o Builder pattern (Ver Design-Patterns/Creational/Builder neste repositório)
 */
public class Main {
    public static void main(String[] args) {
        LeaveApplication application = buildLeaveApplication(LeaveApplication.getBuilder());

        System.out.println(application);
        //Acima, como não chamamos a operação processLeaveApplocation, o pedido de afastamento sempre estará pendente

        System.out.println("**********************************");

        /*Abaixo, criamos a chain e chamamos o processLeaveApplocation do primeiro item que vier nela. Se ele não
        puder lidar com o nosso request, passará para o próximo objeto da chain.
        */
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    /**
     * Método que cria a chain. Primeiro criamos todos os objetos que irão compor a chain e, no fim, retornaremos
     * o objeto que queremos que seja o primeiro item.
     */
    private static LeaveApprover createChain(){
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);
        return lead;
    }

    private static LeaveApplication buildLeaveApplication(LeaveApplicationBuilder builder){
        return builder.withType(Type.SICK).from(LocalDate.now()).to(LocalDate.of(2022, 10, 22))
                .build();
    }
}
