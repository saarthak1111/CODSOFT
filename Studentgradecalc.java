import java.util.*;
import java.util.Scanner;

public class Studentgradecalc{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
		int sum = 0;
	    System.out.println("Welcome to grade calculator!!");
	    System.out.println("Enter number of subjects you had given exam: ");
	    int sub = sc.nextInt();
	    System.out.println();
	    System.out.println("Enter your marks in " + sub +" subjects: ");
	    
	    for(int i = 0 ;i<sub; i++) {
	    	int num = sc.nextInt();
	    	sum+=num;
	    }
	   int percentage = sum / sub;

	   if (percentage >= 90 && percentage <= 100) {
           System.out.println("You have got Grade A");
       } else if (percentage >= 80) {
           System.out.println("You have got Grade B");
       } else if (percentage >= 70) {
           System.out.println("You have got Grade C");
       } else if (percentage >= 60) {
           System.out.println("You have got Grade D");
       } else if (percentage >= 50) {
           System.out.println("You have got Grade E");
       } else {
           System.out.println("You got Failed with Grade F");
       }
  }
}
