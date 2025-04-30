package NewPackage;

import java.util.Scanner;

public class ClassTask1 {
	 String f;
	String l;
	int a;
	
	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		ClassTask1 obj=new ClassTask1();
		System.out.println("ENter the fName:");
		obj.f = ac.nextLine();
		
		System.out.println("Enter the lName:");
		obj.l=ac.nextLine();
		
		
		
		System.out.println("enter age:");
		obj.a=ac.nextInt();
		
	
	}
	

}
