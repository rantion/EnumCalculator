package com.enum_Calculator;
import java.util.Scanner;

public class Main {

    private double operand1, operand2;
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	    new Main();
    }

    public Main(){
        startCalculator();
    }

    public void startCalculator(){
        Calculator newCalc = new Calculator(operand1, operand2);

         }




}
