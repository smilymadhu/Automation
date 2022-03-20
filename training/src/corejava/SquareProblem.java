package corejava;

public class SquareProblem {
public int square(int number)
{
	return number*number;
	
}
public int getSumofsquare(int number)
{
	int sum=0;
	
	for (int i=1;i<=number;++i)
	{
		sum+=square(i);
		
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareProblem squareProblem=new SquareProblem();
		int sum=squareProblem.getSumofsquare(6);
		System.out.println(sum);
		
	}

}
