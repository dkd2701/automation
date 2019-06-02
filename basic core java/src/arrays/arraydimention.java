package arrays;

public class arraydimention {

	public static void main(String[] args) {
		
		
		String [][] arr= new String [5][2];
		
		// Row1
		
		arr[0][0]="u1";
		arr[0][1]="p1";
		
		arr[1][0]="u2";
		arr[1][1]="p2";
		
		arr[2][0]="u3";
		arr[2][1]="p3";
		
		arr[3][0]="u4";
		arr[3][1]="p4";
		
		arr[4][0]="u5";
		arr[4][1]="p5";
		
	for (int r=0; r<5 ; r++)
	{
		for (int c=0; c< 2 ; c++) {
			
			System.out.print(arr [r][c] + "    ");
		}
		
		System.out.println();
	}
		
		
		
		
		
		
		
		
		

	}

}
