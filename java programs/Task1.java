package NewPackage;

import java.util.Scanner;

public class Task1 {
	//user input
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
	
		System.out.println("Enter the value");
		int b=sc.nextInt();
		System.out.println("addition:" +(a+b));
		System.out.println("sub:" +(a/b));
		System.out.println("module:"+(a%b));
		System.out.println("division:"+(a-b));
		
		//MAXIMUN VALUE using Ternary 
		int num1=10;
		int num2=20;
		int max=(num1 > num2)?num1:num2;
		System.out.println("The maximum number is :"+max);
		//pre decremnet and post decrement
		int x,y,z;		
		Scanner ac=new Scanner (System.in);
		System.out.println("enter any integer x:");
		x=ac.nextInt();
		y=--x;
		System.out.println("Result after pre Increment x:"+x);
		System.out.println("Result after pre Increment y:"+y);
		z=x--;
		System.out.println("Result after pre Increment x:"+x);
		System.out.println("Result after post Increment z:"+z);
		
		//3.write a java program to print the Boolean if the number is greater
		//than 10 if the number is less than 5 if the number is not equal to 100 if 
		//the number is less than 3 and the number is grater than 5
		
		//greater Than
		int num3=10;
		int num4=5;
		
		boolean isGreaterthan=(num3>num4);
		System.out.println("num3 is greater than num4:"+isGreaterthan);
		//lessthan
		int num5=5;
		int num6=3;
		boolean isLessthan=(num5<num6);
		System.out.println("num3 is greater than num4:"+isLessthan);
		int num7=100;
		int num8=99;
		boolean isNotEqual=(num7!=num8);
		System.out.println("num3 is greater than num4:"+isNotEqual);
		
		
		
		
		///

	
		
		
		
		
		

	}

}
