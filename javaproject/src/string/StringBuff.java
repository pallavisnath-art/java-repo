package string;

public class StringBuff {

	public static void main(String[] args) {
StringBuffer n=new StringBuffer("java");
System.out.println(n);

//method 1 append()
n.append(" program");
System.out.println(n);

//method 2 insert
n.insert(5, "Easy ");
System.out.println(n);
//method 3 replace()
n.replace(5, 9, "simple");
System.out.println(n);
//method 4 delete()
n.delete(12,19);
System.out.println(n);
// method 5 capacity()
n.capacity();
System.out.println(n.capacity()); 
StringBuffer n1=new StringBuffer("");
// method 6 substring()
System.out.println(n.substring(1, 4));
	}

}
