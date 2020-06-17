package simpleproject;

public class Linux  extends OperatingSystem{
	
	
	private String dist;

	public Linux()
	{
		super( " linux" , "unknown");
		this.dist ="unknown";
	}
	
	
	
	public Linux( String version , String dist )
	{
		super("linux" , version);
		this.dist = dist;
	}
	
	
	@Override 
	public void PrintOsInfo()
	{
		super.PrintOsInfo();
		System.out.println( "  dist : " + this.dist );
	
   }
	
	

}
