package Practice;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int a,b;
	boolean t =true;
	while (t) {
		
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		
		System.out.println("Enter + for addition");
		System.out.println("ENter - for substraction");
		System.out.println("Enter * for mult");
		System.out.println("ENter / for div");
		System.out.println("Enter e to exit");
//		sc.nextLine();
		
		String Choice = sc.next();
		switch(Choice) {
		case "+":
			System.out.println("Addition : " + (a+b));
			break;
		case "-":
			System.out.println("Substraction : " + (a - b));
			break;
		case "*":
			System.out.println("Multi : " + (a*b));
			break;
		case "/":
			System.out.println("Div : " + (a/b));
			break;
			
		case "e" : 
			System.out.println("Exit...");
			break;
			
		default:
			System.out.println("Invalid case:");
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
