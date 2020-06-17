package simpleproject;

public class OperatingSystem {
	
	
	private String name;
	private String version;
	
	public OperatingSystem()
	{
		this.name = "none";
		this.version = "none";
	}
	
	public OperatingSystem( String osname , String osversion)
	{
		this.name = osname;
		this.version = osversion;
	}
	

	
	
	public void PrintOsInfo()
	{
		System.out.println( "  os : " + this.name +   " version : " + this.version );
	
   }
	
	
	public static void PrintOs( OperatingSystem os)
    {
	      os.PrintOsInfo();
	
    }

	
	

	

    public static void main(String[] args) {
	
	    
			windows win10 = new windows( "10" );  
			Mac lion = new Mac("lion");
			Linux x  = new Linux( "9" ,"kali");
			
			
			
			  PrintOs(win10);
			  PrintOs(lion);
			  PrintOs(x);
			
   
	}

	
	
	
	
}
