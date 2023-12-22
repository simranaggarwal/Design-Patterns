package com.examples.designpatterns.behavioural.interpreter.expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//Client
//Builds an abstract tree
//Invokes the evaluate() operation.
public class ExpressionInterpreter {

    private ASTNode root;

    public ASTNode buildAST(Context context) {
        root = buildAST(context.getContext());
        return root;
    }

    public int evaluate() {
        return root.evaluate();
    }

    private ASTNode buildAST(String expressionString) {

        Stack<ASTNode> valueNodes = new Stack<>();
        Stack<String> operatorNodes = new Stack<>();
        List<String> arrayList = Arrays.asList(expressionString.split(" "));
        Collections.reverse(arrayList);
        for(String expression: arrayList) {
            if(expression.matches("[+-]?[0-9]+")) {
                int value = Integer.parseInt(expression);
                valueNodes.add(new ValueNode(value));
            } else {
                operatorNodes.add(expression);
            }
        }
        while (!operatorNodes.empty()) {
            String operator = operatorNodes.pop();
            ASTNode left = valueNodes.pop();
            ASTNode right = valueNodes.pop();

            if (operator.equals("+")) {
                valueNodes.push(new AdditionNode(left, right));
            } else if (operator.equals("-")) {
                valueNodes.push(new SubtractionNode(left, right));
            }
        }
        return valueNodes.pop();
    }

}
