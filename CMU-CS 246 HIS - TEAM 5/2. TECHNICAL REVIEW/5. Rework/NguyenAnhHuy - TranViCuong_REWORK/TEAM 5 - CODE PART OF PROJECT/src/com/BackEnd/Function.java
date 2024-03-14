package com.BackEnd;

public class Function {

    //public double sum;
    public double num1;
    public double num2;

    public Function() {
        num1 = 0;
        num2 = 0;
    }

    public double AddictionNumber(double num1, double num2) {
        return num1 + num2;

    }

    public double SubtractionNumber(double num1, double num2) {
        return num1 - num2;
    }

    public double MultiplicationNumber(double num1, double num2) {
        return num1 * num2;

    }

    public double DivisionNumber(double num1, double num2) {
        return num1 / num2;

    }

    public double ModulusNumber(double num1, double num2) {
        return num1 % num2;

    }
}
