package simpleproject;

public class Calculator {

	
	public static double Add(double x, double y)
	{
		return x+y;
	}
	
	public static double Sub(double x, double y)
	{
		return x-y;
	}
	
	public static double Mul(double x, double y)
	{
		return x*y;
	}
	
	                                              
	public static double Div(double x, double y)throws ArithmeticException
	{
		if( y==0)
			throw new ArithmeticException();    //exception
		return x/y;
	}
	
	
	public static void main(String[] args) {
		
		double resulta = Calculator.Add(10.2, 3.7);
		double resultm = Calculator.Mul(10.2, 3.7);
		System.out.println(resulta);
        System.out.println(resultm);

        
        double resultd = 0.0;
        try {
         resultd = Calculator.Div(10.2, 0.0);
        	
	    }
	
	   catch(ArithmeticException e) //Exception catcher
        {
		   
        }
	
        System.out.println(resultd);
	
	
	}
	
	
}
