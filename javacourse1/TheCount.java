package javacourse2;

public class TheCount {
	
	private static int count =0;
	
	//encapsulation
	public TheCount()
	{
		count++;                                               
	}
	
	public static int getcount()
	{
      return count;
    }

	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		TheCount a = new TheCount();
		TheCount b = new TheCount();
		TheCount c = new TheCount();
	    
		
		System.out.println("The objects count :"+ TheCount.getcount());
		
		//return number object (
		
	}
	
	
	
	
	
	
	
}