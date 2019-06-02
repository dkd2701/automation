package conditionalpack;

public class nestedif {

	public static void main(String[] args) {
		
		
		boolean login=false;
		
		if(login)
		{
			System.out.println("login passed successfully");
			
			boolean logoDispalyed=true;
			if (logoDispalyed){
				System.out.println("correct logo should be displayed");
			}
			else 
			{
				System.out.println("home page is not displayed properly");
			}
		}

	}

}
