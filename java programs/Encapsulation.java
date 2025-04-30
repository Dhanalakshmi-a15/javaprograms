package NewPackage;

public class Encapsulation {
	private String name;
	

	public String getName()
	{
		return name;
	}
	public void setName(String newname)
	{
		//this return the current objects  return type only void.
		
		//this can be use //to call another constrotctor with same class this can be aregument to another method.
		//this cant be use static method satatic block.
		this.name=newname;
	}

}
