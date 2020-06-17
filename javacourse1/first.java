package javacourse2;


//recursive method
public class first {
	
	
	
	public void draw(int val)
	{
		if( val ==0)
			return;
		
		for(int i =0; i < val; i++) {
		
			System.out.println(" * ");
		
		}
		
			
		System.out.println("  ");
	
		draw(val-1);
				
			
	}
	
	
	

	
     public static void main(String[] args) {
		
    	 first shape = new first();
    	 shape.draw(5);
    				
			
    }
	
}
		
	
	
