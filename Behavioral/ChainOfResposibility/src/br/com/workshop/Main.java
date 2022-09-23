package br.com.workshop;

import static br.com.workshop.Type.PTO;
import static br.com.workshop.Type.SICK;

import java.time.LocalDate;

/**
 * Aqui temos a implementação do pattern de Chain of Responsibility. Para realizar a criação do {@link LeaveApplication},
 * optei por utilizar o Builder pattern (Ver Design-Patterns/Creational/Builder neste repositório)
 */
public class Main {
    public static void main(String[] args) {
        LeaveApplication application = buildLeaveApplication(LeaveApplication.getBuilder());

        System.out.println(application);
        System.out.println("**********************************");
        System.out.println(processApplication(application));

        /*Implmentando a Chain:
        1 - Criar a interface LeaveAprrover (nosso Handler)
        2 - Colocar o LeaveApprover no construtor do Employee (sucessor)
        3 - Criar método abstrato processRequest na Employee (ele vai dizer se o elo da chain pode ou não processar o request)
        4 - Criar método de createChain aqui mesmo
        5 - Com a chain criada, chamar método da LeaveApprover
        */
    }

    private static String processApplication(LeaveApplication application){
        if(application.getType() == SICK){
            application.approve("Manager");
            return application.toString();
        }
        if(application.getType() == PTO && application.getNoOfDays() <= 5){
            application.approve("Manager");
            return application.toString();
        }
        if(application.getType() == SICK && application.getNoOfDays() <= 2){
            application.approve("Project Lead");
            return application.toString();
        }
        if(application.getType() == PTO){
            application.approve("Director");
            return application.toString();
        }
        return "Liberação negada";
    }

    private static LeaveApplication buildLeaveApplication(LeaveApplicationBuilder builder){
        return builder.withType(SICK).from(LocalDate.now()).to(LocalDate.of(2022, 10, 20))
                .build();
    }
}
