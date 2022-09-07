package br.com.ex1;

/**
 * Non-Terminal Expression
 */
public class OrExpression implements PermissionExpression {

    private PermissionExpression expression1;
    private PermissionExpression expression2;

    public OrExpression(PermissionExpression one, PermissionExpression two) {
        this.expression1 = one;
        this.expression2 = two;
    }

    /**
     * Por ser uma expressão "não final", ela sempre irá chamar o interpret() das
     * expressões atreladas a ela
     */
    @Override
    public boolean interpret(User user) {
        return expression1.interpret(user) || expression2.interpret(user);
    }

    @Override
    public String toString() {
        return expression1 +" OR "+expression2;
    }
}
