package functions;

public class car

{

	String name;
	String colour;
	static int wheels=4;
	
	// Default constructor
	
	public car(String name , String colour) // parameter constructor 
	
	{
		this.name=name;
		this.colour=colour;
		
	}
	
	
	
	
	public car() { // default constructor 
		
	
	}




	public void driving ()
	{
		System.out.println("i am driving a "+colour+" car "+name+" which has "+wheels+" wheels "); 
	}
	
	
}
