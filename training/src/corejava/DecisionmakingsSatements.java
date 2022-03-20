package corejava;

public class DecisionmakingsSatements {
		int a=9;
public void ifelse()
{
	if (a%3==0)
		
	
		System.out.println("number is an fizz number");
		else
			System.out.println("number is an buzz number");
}


	int b=20;
	
	public void odd()
	{
		if (b%5==0)
			
		
			System.out.println("number is an buzz number");
			else
				System.out.println("number is an fizz number");
				
}

int c=15;
	
	public void fizzbuzz()
	{
		
		{
	        boolean divisibleby3 = (c%3==0);
	        boolean divisibleby5 = (c%5==0);
	        
	        if(divisibleby3) {
	            System.out.println(c + " can be divided by 3" );
	        } else {
	            System.out.println(c + " cannot be divided by 3");
	        }
	        if(divisibleby5){
	            System.out.println(c + " can be divided by 5");
	        } else {
	            System.out.println(c + " cannot be divided by 5");
	        }

	    }



	}

int d=17;
	
	public void fizzbuzz1()
	{
		
		{
	        boolean divisibleby3 = (d%3==0);
	        boolean divisibleby5 = (d%5==0);
	        
	        if(divisibleby3) {
	            System.out.println("right");
	        } else {
	            System.out.println(d);
	        }
	        if(divisibleby5){
	            System.out.println("right");
	        } else {
	            System.out.println(d);
	        }

	    }



	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionmakingsSatements decisionMakingStatements= new DecisionmakingsSatements();
		
		decisionMakingStatements.ifelse();
       decisionMakingStatements.odd();
        decisionMakingStatements.fizzbuzz();
        decisionMakingStatements.fizzbuzz1();
         
	}

}
