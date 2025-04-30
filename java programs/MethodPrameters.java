package NewPackage;

public class MethodPrameters {
	//method are declared with in the class there are use to formance surturn conditions. 
	public void display() {
		System.out.println("i love car");
	}
	public void speed(int maxspped) {
		System.out.println("my max speed is"+maxspped);
	}

	public static void main(String[] args) {
		
		MethodPrameters  obj=new MethodPrameters();
		obj.display();
		obj.speed(250);
		
	}

}
