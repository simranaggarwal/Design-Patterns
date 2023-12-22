package com.examples.designpatterns.behavioural.interpreter.expression;

//AbstractExpression
public abstract class ASTNode {

    //Operation common to all nodes in Abstract Syntax Tree
    protected abstract int evaluate();
}
