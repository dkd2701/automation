package functions;

public class Acessmodifiers {

	
	public static void main(String[] args)
	
	{
		Acessmodifiers obj= new Acessmodifiers();
		obj.publicmethod();
		obj.privatemethod();
		obj.nonaccessmethod();
		
	}
	
	
	
		//public methode
		
		public void publicmethod()
		
		{
			System.out.println("publicmethod");
			
		}
		
		
		private void privatemethod()
		
		{
			System.out.println("privatemethod");
			
		}
		

		protected void protectedmethod()
		
		{
			System.out.println("protectedmethod");
			
		}
		
		 void nonaccessmethod()
		
		{
			System.out.println("nonaccessmethod");
			
		
	}

}
