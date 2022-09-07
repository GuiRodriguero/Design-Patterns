package br.com.ex1;

/**
 * Non-Terminal Expression
 */
public class AndExpression implements PermissionExpression{

    private PermissionExpression e1;
    private PermissionExpression e2;

    public AndExpression(PermissionExpression p1, PermissionExpression p2) {
        this.e1 = p1;
        this.e2 = p2;
    }

    /**
     * Por ser uma expressão "não final", ela sempre irá chamar o interpret() das
     * expressões atreladas a ela
     */
    @Override
    public boolean interpret(User user) {
        return e1.interpret(user) && e2.interpret(user);
    }
}
