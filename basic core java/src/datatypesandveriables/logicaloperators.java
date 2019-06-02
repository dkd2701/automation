package datatypesandveriables;

public class logicaloperators {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b & a>c)
			
		{
			System.out.println("a is greatest");
		}
		else {
			System.out.println("a is not greatest");
		}
		
		if (a>b || b>c)
		{ System.out.println("a is greater than b or c");}
		
		else {System.out.println("a is smallest");}
		

	}

}
