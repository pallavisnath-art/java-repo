package aggrigation;

public class Student {
	
		String name;
		int age;
		Address addr;//aggregation//one class contain reference to another class  
		Student(String name,int age,Address addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
	}

	public void show()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+addr.city+","+addr.state);
	}

		public static void main(String [] args)
		{
		Address a1=new Address("Chennai","Tamil nadu");
		 Student s1 = new Student("rahul", 25, a1);
				s1.show();
		}
	}

