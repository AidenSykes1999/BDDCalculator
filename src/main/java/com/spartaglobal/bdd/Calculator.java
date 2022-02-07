package com.spartaglobal.bdd;

public class Calculator {

    private Integer num1;
    private Integer num2;

    public void setNum1(int num1) {

this.num1 = num1;

    }


    public void setNum2(int num2) {

this.num2 = num2;

    }


    public Integer add() {
        return num1 + num2;

    }
}
