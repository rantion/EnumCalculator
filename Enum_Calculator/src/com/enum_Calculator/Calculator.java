package com.enum_Calculator;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Rachel
 * Date: 10/14/13
 * Time: 8:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    private int calcOption;
    private double calcResult, operand1, operand2;
    private Scanner scan = new Scanner(System.in);
    private CalculatorOptions modes;


    public Calculator(double firstOperand, double secondOperand){
        operand1 = firstOperand;
        operand2 = secondOperand;
        getOperandsFromUser();

    }

    public void getOperandsFromUser(){
        System.out.println("Please Enter Two Operands:");
        try{
            System.out.println("Operand One: ") ;
            operand1 = scan.nextInt();
            System.out.println("Operand Two: ");
            operand2 = scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Please enter a valid Operand.");
        }
        askUserOperation();
    }

  public void askUserOperation(){

      System.out.println("What would you like to do? \n" +
              "Enter 1 for Addition\n" +
              "Enter 2 for Subtraction\n" +
              "Enter 3 for Multiplication\n" +
              "Enter 4 for Division\n" +
              "Enter 5 to Change Input\n" +
              "Enter 6 to Quit");
      try{
      calcOption = scan.nextInt();
          if(calcOption ==1){
              modes = CalculatorOptions.ADDITION;
          }
          else if(calcOption == 2){
                modes = CalculatorOptions.SUBTRACTION;
          }
          else if(calcOption == 3){
                modes = CalculatorOptions.MULTIPLICATION;
          }
          else if(calcOption == 4){
               modes = CalculatorOptions.DIVISION;
          }
          else if(calcOption == 5){
                 modes = CalculatorOptions.CHANGEINPUT;
          }
          else if (calcOption == 6){
                modes = CalculatorOptions.QUIT;
         }
      }
      catch(Exception e){
          System.out.println("Please Enter a Valid Option");
      }
      performOperation(modes);
  }

    public void performOperation(CalculatorOptions option){
        calcResult=0;
        switch(modes)  {
            case ADDITION:
                calcResult = operand1 + operand2;
                break;

            case SUBTRACTION:
                calcResult = operand1 - operand2;
                break;

            case MULTIPLICATION:
                calcResult = operand1 * operand2;
                break;

            case DIVISION:
                calcResult = operand1 / operand2;
                break;

            case CHANGEINPUT:
                getOperandsFromUser();
                break;

            case QUIT:
                System.exit(1);
                break;
        }
        displayOutput();
    }

    public void displayOutput(){
        System.out.println("Your Answer is: " + calcResult +
        "\nWould you like to perform another operation?\n" +
        "Enter 1 for yes, 2 to exit");
        try{
            int anotherOperation = scan.nextInt();
            if(anotherOperation == 1){
                askUserOperation();
                displayOutput();
            }
            else if(anotherOperation==2){
                System.exit(1);
            }

        }
        catch(Exception e){
            System.out.println("Please enter a valid input");
        }
    }

}
