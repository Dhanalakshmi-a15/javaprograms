
//single Inheritance
package NewPackage;
// super is keyword used to call the method parents class form method of the child class.

class Animal1{
	 public void eat()
	 {
		 System.out.println("I can eat");
	 }
}
class Dog1 extends Animal1
{
 @Override
 public void eat() {
	 //call  method of superclass
	 super.eat();
	 
	 System.out.println("I eat dog food");
 }
 public void bark() {
	 System.out.println("I can bark");
 }
}
public class SuperKeyword {
	public static void main (String args[]) {
		
		Dog1 obj=new Dog1();
		obj.eat();
		obj.bark();
	}

}
// IN multi level inheritance a subclass extends from super claass and then same sub class acts as a superclass for another class.
