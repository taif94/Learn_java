package javacourse3;

public class A3 {

	public void printval(Myinterface i)
	{
		i.printdata();
	}
	
	
	
	
	
	  public static void main(String[] args) {
		   
		   
		   
		   A3 a = new A3();
		
		   
		  //create class anonymous
		   a.printval(new Myinterface() {
			   
			   
			   
			   public void printdata()
				{
					System.out.println("welcom to app2");
				}
				
				public int getresult(char c)
					{
						return 20;
				
				   }
				
			   
		 
		   });  


		   
		   
		   //create class anonymous , object anonymous
		   new Myinterface() {
			   
			   
				
				public void printdata()
				{
					System.out.println("www.java.net");
				}
				
				public int getresult(char c)
					{
						return 10;
				
				   }
				
		   }.printdata();
		
		   //this method to call only one function
	  }
		   
 }		   
		   
		   
		   
		   
		   
		   
		   
		   
	
	
      


