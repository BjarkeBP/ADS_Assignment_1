package org.example.calculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class CalculatorTest {

    @Test
    void evaluateExpressionPlus() {
        Calculator calculator = new Calculator();
        ArrayList<Token> arrayList = new ArrayList<>();

        arrayList.add(new Operand(4));
        arrayList.add(new Operand(6));
        arrayList.add(new Operator('+'));

        try {
            assertEquals(10, calculator.evaluateExpression(arrayList));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void evaluateExpressionMinus() {
        Calculator calculator = new Calculator();
        ArrayList<Token> arrayList = new ArrayList<>();

        arrayList.add(new Operand(4));
        arrayList.add(new Operand(6));
        arrayList.add(new Operator('-'));

        try {
            assertEquals(-2, calculator.evaluateExpression(arrayList));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void evaluateExpressionMul() {
        Calculator calculator = new Calculator();
        ArrayList<Token> arrayList = new ArrayList<>();

        arrayList.add(new Operand(4));
        arrayList.add(new Operand(6));
        arrayList.add(new Operator('*'));

        try {
            assertEquals(24, calculator.evaluateExpression(arrayList));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void evaluateExpressionDiv() {
        Calculator calculator = new Calculator();
        ArrayList<Token> arrayList = new ArrayList<>();

        arrayList.add(new Operand(6));
        arrayList.add(new Operand(2));
        arrayList.add(new Operator('/'));

        try {
            assertEquals(3, calculator.evaluateExpression(arrayList));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void evaluateExpressionComplex() {
        Calculator calculator = new Calculator();
        ArrayList<Token> arrayList = new ArrayList<>();

        arrayList.add(new Operand(4));
        arrayList.add(new Operand(6));
        arrayList.add(new Operator('+'));
        arrayList.add(new Operand(6));
        arrayList.add(new Operator('*'));
        arrayList.add(new Operand(10));
        arrayList.add(new Operator('/'));

        try {
            assertEquals(6, calculator.evaluateExpression(arrayList));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void evaluateExpressionException() {
        try {
            assertThrowsExactly(EmptyStackException.class, () -> {
                Calculator calculator = new Calculator();
                ArrayList<Token> arrayList = new ArrayList<>();

                arrayList.add(new Operand(6));
                arrayList.add(new Operator('+'));
                arrayList.add(new Operand(6));
                arrayList.add(new Operator('*'));
                arrayList.add(new Operand(10));
                arrayList.add(new Operator('/'));

                calculator.evaluateExpression(arrayList);
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}