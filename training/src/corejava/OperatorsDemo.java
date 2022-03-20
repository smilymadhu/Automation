package corejava;

public class OperatorsDemo {
	int a=30,b=10;
	
	public void ArithematicOperators()
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		//modulus operator is %
		System.out.println(a%b);
		//increment
		System.out.println(++a);
		//decrement
		System.out.println(--b);
	}
	
public void assignmentOperators()

{
	System.out.println(a);
	a=a+2;
	System.out.println(a);
	a+=2;
	System.out.println(a);
	a-=2;
	System.out.println(a);
	a*=2;
	System.out.println(a);
	a/=2;
	System.out.println(a);
}

public void relationalOperators()
{
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);
}
public void logicalOperators()
{
	boolean result=a>b && a>50;
	System.out.println(result);
	result=a>b && a>50;
	System.out.println(result);
	result=a>b && a>15;
	System.out.println(result);
	result=a>b || a>50;
	System.out.println(result);
	System.out.println(!result);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OperatorsDemo operatorsDemo=new OperatorsDemo();
//operatorsDemo.ArithematicOperators();
operatorsDemo.assignmentOperators();
//operatorsDemo.relationalOperators();
operatorsDemo.logicalOperators();

	}

}
