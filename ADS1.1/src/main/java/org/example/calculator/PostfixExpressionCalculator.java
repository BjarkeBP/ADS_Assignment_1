package org.example.calculator;

import java.util.ArrayList;

public interface PostfixExpressionCalculator {
    public int evaluateExpression(ArrayList<Token> tokenList) throws Exception;
}
