package org.example.calculator;

import org.example.Stack.ADSLinkedListStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Calculator implements PostfixExpressionCalculator {

    private ADSLinkedListStack<Token> stack;

    public Calculator() {
        this.stack = new ADSLinkedListStack<>();
    }

    public int evaluateExpression(ArrayList<Token> tokenList) throws Exception {

        for (int i = 0; i < tokenList.size(); i++) {

            if (tokenList.get(i) instanceof Operand){
                stack.push(tokenList.get(i));

            } else {
                if (!validateOperation(tokenList.get(i))) {
                    throw new EmptyStackException();
                }

                doOperation(tokenList.get(i));
            }
        }
        Operand temp1 = (Operand) getResult();
        return temp1.getNumber();
    }

    private boolean validateOperation(Token operator){
        Token temp1 = stack.pop();
        Token temp2 = stack.pop();
        stack.push(temp2);
        stack.push(temp1);

        if (!(temp1 instanceof Operand) || !(temp2 instanceof Operand)){
            return false;
        }

      return true;
    }

    private void doOperation(Token operator){
        Operand temp2 = (Operand) stack.pop();
        Operand temp1 = (Operand) stack.pop();
        Operator temp3 = (Operator) operator;
        int result = 0;

        if (temp3.getOperator() == '+'){
            result = temp1.getNumber()+temp2.getNumber();

        } else if (temp3.getOperator() == '-') {
            result = temp1.getNumber()-temp2.getNumber();

        } else if (temp3.getOperator() == '/') {
            result = temp1.getNumber()/temp2.getNumber();

        } else if (temp3.getOperator() == '*') {
            result = temp1.getNumber()*temp2.getNumber();
        }

        stack.push(new Operand(result));
    }

    private Token getResult() throws Exception {
        Token temp1 = stack.pop();

        if (!stack.isEmpty()){
            throw new Exception("stack is not empty when finished");
        }

        return temp1;
    }
}
