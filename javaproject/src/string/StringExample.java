package string;

public class StringExample {

	public static void main(String[] args) {
		// by using stringLiteral
String name= "pallavi";
String name1="pallavi";
//by using new keyword
String name2=new String("pyari");
String name3=new String("pyari");
System.out.println(name==name1);
System.out.println(name2==name3);//obj are equal check
System.out.println(name.equals(name));//use to compare value
	}

}
