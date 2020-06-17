package javacourse3;

public class PDF  implements plugin{
	
	
	
	
	
	public void loodplugin(String name)
	{
		
		System.out.println(name);
	
	}
	
	

	
	
	public boolean executeplugin() 
	{
		return false;
	}
	
	
	
	
	
	public void closeplugin() 
	{
		System.out.println("closed");
	}
	
	
}
