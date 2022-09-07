package br.com.ex1;

public class Main {
    public static void main(String[] args) {
        Report report1  = new Report("Cashflow repot", "FINANCE_ADMIN OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression  exp = builder.build(report1);
        System.out.println(exp);

        User user1 = new User("Dave", "admin");

        //Aqui o programa irá interpretar e ver se o User possui um dos acessos descritor no construtor do report
        System.out.println("User access report: " +  exp.interpret(user1));
    }
}
