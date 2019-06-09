package oops.polymorphism;

public class nodirectobject


{

	int age;
	
	private static nodirectobject obj = new nodirectobject();
	
private nodirectobject()

{
	
}

public static nodirectobject getobject()

{
	return  obj;  //data type of your function 
	

	
}}
