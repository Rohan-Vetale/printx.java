package allClasses;

public class printx {

	public static void main(String[] args)
	{
	int sp1,st1,sp2,st2;
	int n=10;
	int i;
			for(i=1; i<6 ;i++) // Ye loop x ke top part ke liye hai
				 {	
				
			for(sp1=0 ; sp1<i ; sp1++)
			{
				System.out.print(" ");//yaha pe space ko replace krna h
			}
			System.out.print("x");
			for(int j=n; j>2 ; j--)
			{
				System.out.print(" ");//yaha pe bhi spaces ko replace krna hai
			}
			System.out.print("x");
			n-=2;
			System.out.println();
			
			}
	n=1;
	for(i=5; i>1 ;i--) // Ye wala x ke bottom part ke liye
	{
		for(int l=1 ;l<i ;l++)
		{
			System.out.print(" ");
		}
		System.out.print("x");
		
		for(int j=0 ; j<n ;j++)
		{
			System.out.print(" ");//yaha pe bhi spaces ko replace krna hai
		}
		System.out.print("x");
		n+=2;
		System.out.println();	
	}
	
	
	}

}
