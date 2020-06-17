package javacourse3;

public  abstract class shape {
	
	
	public String name;
	
	public shape(String name)
	{
		this.name = name;
	}
	

	
	
	public abstract  void Draw();
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Rect r = new Rect();
		
	
		shape p = r;
	
	
	   System.out.println(p.name);
	
	
	
	}
	
	
	
	
	
	
	
	
}
