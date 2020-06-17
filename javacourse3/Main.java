package javacourse4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		First <Integer> f = new First <Integer>();
		
		First <Float> f2 = new First <Float>();
		
		f.content = 10;
		f2.content = 1.7f;
		
	
	    
		
	    
	    Second <Integer,Float> f1 = new Second <Integer,Float>();

	    Second <String,String> f3 = new Second <String,String>();
	    
	    
		f1.Test(10, 21.1f);
		
		f3.Test("welcom", "java");
		
		System.out.println(f1);
		System.out.println(f3);
	    
	}

}
