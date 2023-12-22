package com.examples.designpatterns.behavioural.interpreter.expression;

import com.examples.designpatterns.behavioural.interpreter.expression.ASTNode;

//Non-Terminal Expression
public class SubtractionNode extends ASTNode {

    private ASTNode left;

    private ASTNode right;

    public SubtractionNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    protected int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
