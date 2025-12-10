package superkeyword;

public class Supervariablec extends Supervariablep {
int x=3;
public static void main( String arg[])
{
Supervariablec obj=new Supervariablec();
obj.display();
}
void display()
{
	System.out.println( "child x="+x);
	System.out.println("parent x="+super.x);
	}
}
