package javacourse2;

import java.util.Scanner;

public class simple {

	
	private int x;
	private int y;
	
	//composition
	private Scanner scn;
	
	public simple()
	{
		this.scn = new Scanner(System.in);
		
		System.out.println("enter first number");
		this.x = this.scn.nextInt();
		System.out.println("enter second number");
		this.y = this.scn.nextInt();
	}
  
      
      

       public int Add()
       {
    	   return this.x + this.y;
       }

      public int Sub()
      {
    	  return this.x - this.y;
      }

       public void setx(int a)
       {

          this.x =a;
     }

       
       public void sety(int a)
       {

          this.y =a;
     }

       public int getx()
       {

           return this.x;
     }

       public int gety()
       {

        return this.y;
     }

      
   	public static void main(String[] args) {
		
   		simple s = new simple();
   		int result;
   		
   		s.setx(3);
   		s.sety(5);

		result = s.Add();
		System.out.println(result);
		
		result = s.Sub();
		System.out.println(result);
		
		
		
		another a = new another();
		
		a.setx(3);
   		a.sety(5);
   		
		result = a.Mul();
		System.out.println(result);
		
		result = a.Div();
		System.out.println(result);
		
		
		
		System.out.println(a.getx());
		System.out.println(a.gety());
		
		
    }    
   
       
       
       
       
       
       
       
       
}





