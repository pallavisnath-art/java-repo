package thiskeyword;

public class thisconstructor {

	
public thisconstructor()
{
	this("pallavi");
	int age =12;
	System.out.println(age);
}
public thisconstructor(String name)
{
	this(10,20);
	System.out.println(name);

}
public thisconstructor(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
thisconstructor obj= new thisconstructor();

}
}
