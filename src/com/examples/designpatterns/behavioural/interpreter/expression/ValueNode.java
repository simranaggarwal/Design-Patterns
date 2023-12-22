package com.examples.designpatterns.behavioural.interpreter.expression;

//Terminal Expression
public class ValueNode extends ASTNode {

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    protected int evaluate() {
        return value;
    }
}
