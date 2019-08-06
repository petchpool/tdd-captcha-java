package com.example.demo.captcha;

class CaptCha {

    private int left;
    private int right;
    private int operator;

    CaptCha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    int getLeft() {
        return this.left;
    }

    String getRight() {
        String[] numberWords = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return numberWords[this.right];
    }

    String gerOperator() {
        String[] operatorWords = {"", "+", "-", "*"};
        return operatorWords[this.operator];
        /*if (this.operator == 2) {
            return "-";
        }
        if (this.operator == 3) {
            return "*";
        }
        return "+";*/
    }
}
