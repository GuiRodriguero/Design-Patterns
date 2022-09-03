package br.com.ex1WithBuilder;

/**
 * Handler Concreto. Um dos objetos da chain
 */
public class Director extends Employee{

    public Director(LeaveApprover nextApprover) {
        super("Director", nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if(application.getType() == Type.PTO) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
