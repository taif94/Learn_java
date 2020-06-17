package javacourse2;

public class over {
	
	
	//overload method
	public int Add(int x , int y)
	{
	
		return x+y;
	}
	
	public float Add(float x, float y )
	{
		return x+y;

	}

	public double Add(double x, double y )
	{
		return x+y;

	}


	public static void main(String[] args) {
		
		over c = new over();
		float result = c.Add(1.3f, 5.4f);
		
		System.out.println(result);
		
		
		
		
	}







}


