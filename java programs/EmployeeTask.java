package NewPackage;

public class EmployeeTask {
	private int empid;
	private String ename;
	private double esalary=566;
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int newempid )
	{
			this.empid=newempid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String newename)
	{
			this.ename=newename;
	}
	public double getEsalary()
	{
		return esalary;
	}
	
public static void main(String[] args) {
	
	EmployeeTask obj=new EmployeeTask();
	obj.setEmpid(001);
	System.out.println(obj.getEmpid());
	EmployeeTask obj1=new EmployeeTask();
	obj1.setEname("dhanam");
	System.out.println(obj1.getEname());
	EmployeeTask obj2=new EmployeeTask();
	System.out.println(obj2.esalary);
	
	

}
	

}
