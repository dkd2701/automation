package arrays;

public class arrayprogram1 {

	public static void main(String[] args) 
	
	{
		
Object[] arr=new Object [4];


arr[0]=1;
arr[1]="deepak";
arr[2]=true;
arr[3]=3.45;


System.out.println(arr.length);

for (int i=arr.length-1; i>=0; i--) {
	
	System.out.println(arr[i]);
}


	}

}
