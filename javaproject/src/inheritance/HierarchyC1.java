package inheritance;

public class HierarchyC1 {
	public static void  main (String[] arg)
	{
		HierarchyC1 obj=new HierarchyC1();
	
		obj.draw();
		obj.write();
		
	}
	public void write()
	{
		System.out.println("method to write");
	}
	public void draw()
	{
		System.out.println("method to draw");
	}
}
