package NewPackage;

public class BankTask {
 private int anumber;
 private double balance;

	public int getAnumber()
	{
		return anumber;
	}
	public void setAnumber(int newanumber)
	{
			this.anumber=newanumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double newbalance)
	{
			this.balance=newbalance;
	}
	
	public static void main(String[] args)
	{
		BankTask obj=new BankTask();
		obj.setAnumber(1286277819);
		System.out.println(obj.getAnumber());
		BankTask obj1=new BankTask();
		obj.setBalance(1739);
		System.out.println(obj1.getBalance());
	}

}
