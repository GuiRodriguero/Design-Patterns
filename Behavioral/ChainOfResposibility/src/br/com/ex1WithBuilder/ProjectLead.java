package br.com.ex1WithBuilder;

/**
 * Handler Concreto. Um dos objetos da chain
 */
public class ProjectLead extends Employee{

    public ProjectLead(LeaveApprover sucessor) {
        super("Project Lead", sucessor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        //No nosso cenário, o ProjectLead poderá processar a request somente em casos onde:
        if(application.getType() == Type.SICK && application.getNoOfDays() <= 2){
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
