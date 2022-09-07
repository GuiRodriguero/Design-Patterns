package br.com.ex1;

/**
 * Abstract Expression
 */
public interface PermissionExpression {
    boolean interpret(User user);
}
