import java.util.*;
import java.util.Random;

public class NumberGuessingGame {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int randnum = (int)(Math.random()*100)+1;
    int usernum = 0;
    int attempts = 0;

    System.out.println("Welcome to Number Guessing Game!!");
    System.out.println("I will select a number from 1 to 100 and you have to guess it");
    System.out.println("So are you ready?");
    String ans = sc.next();

    if(ans.equalsIgnoreCase("yes")){
        System.out.println("Ohk! So i have guessed a numeber");

       do{
         System.out.println("Guess the number: ");
         usernum = sc.nextInt();
         attempts++;

         if(usernum == randnum){
           System.out.println("Correct!! You have guessed the number..");
           System.out.println("You have guessed the number " + randnum + " in " + attempts + " attempts");
           break;
         }
         else if(usernum > randnum){
           System.out.println("Too High!... Try smaller one!");
         }
         else if(usernum < randnum){
           System.out.println("Too Low!... Try larger one!");
         }
         else{
           System.out.println("Invalid Number");
         }
       }while(usernum != randnum);
    }
    else{
      System.out.println("Ohk! Will See You Soon.. Come Back Soon!");
    }
  }
  }         
