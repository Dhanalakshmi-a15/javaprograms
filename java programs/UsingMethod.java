package NewPackage;

public class UsingMethod {// in static method we can access without createing a object unless public which can only access object.
	static void mymethod()
	{
		System.out.println("hello sla");
	}
	public void mymethod1()
	{
		System.out.println("hello sla");
	}

	public static void main(String[] args) {
		
		UsingMethod obj=new UsingMethod ();
		mymethod();//static method
		obj.mymethod1();
	}

}
