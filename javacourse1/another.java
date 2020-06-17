package javacourse2;

public class another extends simple {
	
	public another()
	{

		super();
   }

	
	
	
	
	
	
	public  final int Mul()
	{
		return this.getx() * this.gety();
	}
	
	
	public final  int Div()
	
	{
		int y= this.gety();
				if(y==0)
			   return 0;
		
		return this.getx() / y;
	}
	
	
}


