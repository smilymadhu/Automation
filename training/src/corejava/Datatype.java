package corejava;

public class Datatype {

	byte byteName=50;
	short shortName=123;
	int ineName=123456;
	long longName=12345678;
	float floatVar=12.345678F;
	double doubleVar=1234.1234567896;
	char charVar='&';
	boolean boolVar=true;
	String name="java";
	public void myFirstMethod(){
		System.out.println("This is my first method in java");
		System.out.println("I have multiple lines inside my method");
		System.out.println(boolVar);
		
	}
	
				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Datatype datatypenew=new Datatype();

System.out.println(datatypenew.name);
System.out.println(datatypenew.byteName);
System.out.println(datatypenew.ineName);

datatypenew.myFirstMethod();
	}

	}
	



