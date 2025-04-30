package NewPackage;

import java.util.Scanner;

public class Task3 {
    String f;
    String l;
    int a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner inside main

        Task3 obj = new Task3();
        Task3 obj1 = new Task3();
        Task3 obj2 = new Task3();

        System.out.println("Enter the fName:");
        obj.f = sc.nextLine();

        System.out.println("Fname: " + obj.f);
        System.out.println("Lname: " + obj1.l); // Will print null since it's not initialized
        System.out.println("Age: " + obj2.a);   // Will print 0 since default int is 0

        sc.close();
    }
}
