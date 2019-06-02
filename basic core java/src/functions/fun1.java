package functions;

public class fun1 {

	public static void main(String[] args) 
	
	{
	int add =sum(30,40);
	int add2=sum(120,63);
	
	System.out.println(add);
	System.out.println(add2);
	System.out.println(add+add2);
	
	fun1 ref= new fun1();
	
    ref.message("ajb");

	}
	
	public static int sum(int a , int b) 
	
	{
		
		return a+b;
			
	}
	
	public void message (String message)
	
	{
		System.out.println( " YOUR MESSAGE IS WRONG");
	}

}
