package br.com.ex1;

/**
 * Non-Terminal Expression
 */
public class NotExpression implements PermissionExpression {

    private PermissionExpression expression;

    public NotExpression(PermissionExpression expression) {
        this.expression = expression;
    }

    /**
     * Por ser uma expressão "não final", ela sempre irá chamar o interpret() das
     * expressões atreladas a ela
     */
    @Override
    public boolean interpret(User user) {
        return !expression.interpret(user);
    }

    @Override
    public String toString() {
        return " NOT " + expression;
    }
}
