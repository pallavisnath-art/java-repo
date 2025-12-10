package thiskeyword;

public class thismethod 
{

public void sum(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void name(String n)
{
	System.out.println(n);
	this.sum(10,20);
}

public static void main(String[] args) {
	
thismethod obj=new thismethod();
//obj.sum(10,20)
obj.name("pallavi");

}
}
