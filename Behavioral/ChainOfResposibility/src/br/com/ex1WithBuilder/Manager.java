package br.com.ex1WithBuilder;

/**
 * Handler Concreto. Um dos objetos da chain
 */
public class Manager extends Employee{

    public Manager(LeaveApprover nextApprover) {
        super("Manager", nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        switch (application.getType()) {
            case SICK:
                application.approve(getApproverRole());
                return true;
            case PTO:
                if(application.getNoOfDays() <= 5) {
                    application.approve(getApproverRole());
                    return true;
                }
        }
        return false;
    }
}
