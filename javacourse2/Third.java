package javacourse3;

public class Third {

	

	public void printclasssname(Object o)
	{
		if(o instanceof First)
			System.out.println(" first");
		else if( o instanceof Second)
			System.out.println("second");
		else
			System.out.println(" unknown");
	}

	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		First o1 = new First();
		Second o2 = new Second();
		Third o3 = new Third();
		
	
	o3.printclasssname(o2);
	
	}
	


   

	
		
	}













