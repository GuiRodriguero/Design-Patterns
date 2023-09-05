package br.com.ex1WithBuilder;

/**
 * Interface Handler do nosso pattern.
 */
public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();

}
