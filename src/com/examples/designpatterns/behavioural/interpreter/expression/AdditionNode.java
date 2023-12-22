package com.examples.designpatterns.behavioural.interpreter.expression;

//Non-Terminal Expression
public class AdditionNode extends ASTNode {

    private ASTNode left;

    private ASTNode right;

    public AdditionNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    protected int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
