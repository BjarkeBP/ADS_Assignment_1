package org.example.calculator;

public class Operand implements Token {

    private int Number;

    public Operand(int number) {
        Number = number;
    }

    public int getNumber() {
        return Number;
    }
}
