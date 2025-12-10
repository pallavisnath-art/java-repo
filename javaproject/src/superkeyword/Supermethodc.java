package superkeyword;

public class Supermethodc extends Supermethodp{
	public static void main(String arg[])
	{
		Supermethodc obj =new Supermethodc();
		obj.print();
	}
public void print()
{
	System.out.println("child class method");
	super.name();
}
}
