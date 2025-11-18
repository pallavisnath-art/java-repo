package inheritance;

public class MultilevelC extends MultilevelP
{
	public static void  main (String[] arg)
	{
		MultilevelC obj=new MultilevelC();
		obj.dance();
		obj.write();
		obj.song();
	}
	public void dance()
	{
		System.out.println("method to dance");
		}
	
	

}
