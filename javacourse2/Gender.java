package javacourse3;

public enum Gender implements Interfaceg {
	
	
	
	MALE(10, "welcom to java")
	{
		@Override 
		public void printString()
		{
			System.out.println("MALE");
		}
	}
	
	,
	
	FEMALE(20, " java programming language")
	{
		@Override
		public void printString()
		{
			System.out.println("FEMALE");
		}
		
	};
	
	 int val;
	String sval;
	
	
	private Gender(int x , String sv)
	
	{
		this.val = x;
		this.sval = sv;
	}

	
	
	
	public  abstract void printString();
	
	
	
	
	public void Dummy()
	{
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Gender.FEMALE.printString();
		
		
		//use switch with Enumerator
		
		Gender g = Gender.MALE;
		switch(g)
		{
		case MALE:
			System.out.println("MALE");
			break;
			
		case FEMALE:
			System.out.println("FEMALE");
			
		}
		
		
		
		//use Array with Enumerator
		for(Gender e:  Gender.values())
		{
		      e.printString();
		}
		
	
		
	}
	
}    
		
	
	

                    