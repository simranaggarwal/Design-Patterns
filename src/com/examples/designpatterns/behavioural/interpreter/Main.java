package com.examples.designpatterns.behavioural.interpreter;

import com.examples.designpatterns.behavioural.interpreter.expression.Context;
import com.examples.designpatterns.behavioural.interpreter.expression.ExpressionInterpreter;

public class Main {
    public static void main(String[] args) {
        ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter();

        Context context1 = new Context("2 + 30 - 4 - 11");
        expressionInterpreter.buildAST(context1);
        int context1Evaluation = expressionInterpreter.evaluate();
        System.out.println(context1Evaluation);

        Context context2 = new Context("3 - 11 + 8");
        expressionInterpreter.buildAST(context2);
        int context2Evaluation = expressionInterpreter.evaluate();
        System.out.println(context2Evaluation);

        Context context3 = new Context("-3 - 11 + 8");
        expressionInterpreter.buildAST(context3);
        int context3Evaluation = expressionInterpreter.evaluate();
        System.out.println(context3Evaluation);
    }
}
