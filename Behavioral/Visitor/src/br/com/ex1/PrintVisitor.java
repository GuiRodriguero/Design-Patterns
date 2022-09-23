package br.com.ex1;

public class PrintVisitor implements Visitor{

    private AppraisalVisitor.Ratings ratings;

    public PrintVisitor() {}

    public PrintVisitor(AppraisalVisitor.Ratings ratings) {
        this.ratings = ratings;
    }

    @Override
    public void visit(Programmer programmer) {
        String msg = programmer.getName() +" is a " + programmer.getSkill()+" programmer.";
        msg += getRatings(programmer);
        System.out.println(msg);
    }

    @Override
    public void visit(ProjectLead lead) {
        String msg  = lead.getName()+" is a Project Lead with "+lead.getDirectReports().size()+" programmers reporting.";
        msg += getRatings(lead);
        System.out.println(msg);
    }

    @Override
    public void visit(Manager manager) {
        String msg = manager.getName()+" is a Manager with "+manager.getDirectReports().size()+" leads reporting.";
        msg += getRatings(manager);
        System.out.println(msg);
    }

    @Override
    public void visit(VicePresident vp) {
        String msg = vp.getName()+" is a Vice President with "+vp.getDirectReports().size()+" managers reporting.";
        msg += getRatings(vp);
        System.out.println(msg);

    }

    private String getRatings(Employee emp) {
        if(ratings !=null) {
            return "\n\tRatings: Personal="+emp.getPerformanceRating()
                    +"  Final="+ratings.getFinalRating(emp.getEmployeeId());
        } else {
            return "";
        }
    }
}
