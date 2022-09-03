package br.com.ex1WithBuilder;

public abstract class Employee implements LeaveApprover{

    private String role;

    //Próximo objeto da chain
    private LeaveApprover sucessor;

    public Employee(String role, LeaveApprover sucessor) {
        this.role = role;
        this.sucessor = sucessor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        /*if que representa a lógica deste pattern. "Se a classe atual não consegue processar
         a request atual e nós temos uma classe sucessora na chain, chama o método de processar da classe
         sucessora.
         Como ele sabe se pode processar o request ou não?
         R: todas as classes filhas de Employee, implementarão processRequest como eles acharem necessário. Se
         "casar" o request com o jeito de processar da classe filha, a request é processada.
        */
        if(!processRequest(application) && sucessor != null){
            sucessor.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }
}
