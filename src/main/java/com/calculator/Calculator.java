package com.calculator;

public class Calculator {
    int a ;
    int b ;

    public int addAToB (int a , int b){
        return a+b;
    }

    public int subtractBToA (int a, int b){
        return b-a ;
    }

}
class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.addAToB(3,5);
        int result2 = calculator.subtractBToA(11 ,20);
        System.out.println(result1);
        System.out.println(result2);


    }
}