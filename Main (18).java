/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount;
    double tAmount = 0.0, tax = 0.0;
    System.out.print("What is order amount? ");
    amount = sc.nextInt();
    System.out.print("What state do you live in? ");
    String state = sc.next();
    if(state.equals("Wisconsin")){
      System.out.print("What county do you live in? ");
      String county = sc.next();
      if(county.equals("EauClaire")){
        tax = (amount*5.005)/100;
        tAmount = tax + amount;
        }
      else if(county.equals("Dane")){
        tax = (amount*5.004)/100;
        tAmount = tax + amount; 
        }
      else{
        System.out.println("Plese enter correct county");
           }
    }
    else if(state.equals("Illinois")){
      tax = (amount*8)/100;
      tAmount = tax + amount;
    }

    else{
      tax = 0.0;
      tAmount = amount;
    }
  
    System.out.println("The tax is $" + String.format("%.2f",tax) + ".");
    System.out.println("The total is $" + String.format("%.2f",tAmount) + '.');
    }
}