package inheritance;

public class SingleC extends SingleP
{
public static void  main (String[] arg)
{
	SingleC obj=new SingleC();
	obj.dance();
	obj.draw();
	obj.write();
}
public void dance()
{
	System.out.println("method to dance");
}
}
