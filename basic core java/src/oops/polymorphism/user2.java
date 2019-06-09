package oops.polymorphism;

public class user2 {

	public static void main(String[] args) 
	
	
	{
	
		nodirectobject obj=  nodirectobject.getobject();
		obj.age=30;
		
		nodirectobject obj2=  nodirectobject.getobject();
		obj2.age=32;
		
		System.out.println(obj2.age);
		System.out.println(obj.age);
		
		
	}

	
}
