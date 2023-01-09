
public class patternProgram {  // A TO Z Pattern
	
public static void main(String[] args) {

	int n=9;
	int fp=1;
	int sp=2*n-1;

		System.out.println(); // To print the space above the line 
		System.out.println();

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{	// This loop is to print space before the A pattern
				System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//A
				if(i==0 && j!=0 && j!=n-1 || j==0&& i!=0 || j==n-1 && i!=0 || i==(n-1)/2)                                                            
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//B
				if(j==0 || i==0 && j!=n-1 || i==(n-1)/2 && j!=n-1 || i==n-1 && j!=n-1 || 
						j==n-1 && i!=0 && i!=n-1 && i!=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//C
				if(j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1 || 
						j==n-1 && i!=0  && i<(n-1)/4  || j==n-1 && i> 3*(n-1)/4 && i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//D
				if(i==0 && j!=n-1 || j==0 || i==n-1 && j!=n-1 || j==n-1 && i!=0 && i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//E
				if(i==0 || i==(n-1)/2 || i==n-1 || j==0 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//F
				if(i==0 || i==(n-1)/2  || j==0 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//G
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || i==n-1 && j!=0 && j<3*(n-1)/4 ||
						j==n-1 && i!=0&& i<=(n-1)/4 ||j==3*(n-1)/4 && i>(n-1)/2 && i!=n-1 || j==n-1 && i>(n-1)/2
						|| i==(n-1)/2 && j>=3*(n-1)/4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//H
				if(j==n-1|| i==(n-1)/2  || j==0 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{		//I
				if(i==0 || j==(n-1)/2 || i==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
		
		//new line start from here after I

		System.out.println("  ");

		for(int i=0 ; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{		// This loop is to print space before the J pattern
				System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//J
				if(i==0 || j==(n-1)/2 && i!=n-1|| i==n-1 && j<(n-1)/2 && j!=(n-1)/2 || j==0 && i>=3*(n-1)/4 && i!=n-1 )
					System.out.print("*");
				else
					System.out.print(" ");

			}System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//K
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//L
				if(j==0 || i==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//M
				if(j==0 ||j==n-1 || i==j&&i<=(n-1)/2 || i+j==n-1&& i<=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//N
				if(j==0 ||j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//O
				if(j==0 && i!=0 && i<n-1 ||j==n-1&& i>0 && i<n-1 || i==0 && j!=0 && j!=n-1 || 
						i==n-1 &&j!=0&& j!=n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//P
				if(j==0 ||j==n-1 && i>0 && i<(n-1)/2 || i==0 &&  j!=n-1  || i==(n-1)/2 && j!=n-1 )
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//Q
				if(i==0 && j!=0 && j<=3*(n-1)/4 || j==0 && i!=0 && i<3*(n-1)/4 || 
						j==3*(n-1)/4 &&i!=0 && i<3*(n-1)/4 ||  i==3*(n-1)/4 &&j!=0 && j<3*(n-1)/4 || i==j && i>(n-1)/4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{	//R
				if(j==0 ||i==0 &&j!=n-1 || i==(n-1)/2 && j!=n-1 || j==n-1 && i<(n-1)/2 && i!=0 || i==j && i>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//new line start from here after R

		System.out.println("   ");

		for(int i=0; i<n; i++)
		{  
			for(int j=0; j<n; j++)
			{		// Space 
				System.out.print(" ");		
			}
			System.out.print("   ");
			
			for (int j=0; j<n; j++)
			{	//S
				if( i==0 && j!=0 && j!=n-1 || i==n-1 &&j!=0 && j!=n-1 || i==(n-1)/2 &&j!=0 && j!=n-1 || 
						j==0 &&i<(n-1)/2 && i!=0 ||j==n-1 &&i>(n-1)/2 && i!=n-1 || j==0 &&i>3*(n-1)/4 && i!=n-1
						|| j==n-1 && i<(n-1)/4 && i!=0) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for (int j=0; j<n; j++)
			{		//T
				if(i==0 || j==(n-1)/2) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for (int j=0; j<n; j++)
			{		//U
				if(i==n-1 && j!=0 && j!=n-1 || j==(n-1) && i!=n-1 || j==0 && i!=n-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("    ");
			
			for(int j=0; j<=2*n-1; j++)
			{  // V
				if(j==fp || j==sp)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print("     ");
			
			for (int j=0; j<n; j++)
			{		//W 
				if(j==0 || j==n-1  || i==j && i>=(n-1)/2 || i+j==n-1 && j<=(n-1)/2) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for (int j=0; j<n; j++)
			{		//X 
				if( i==j  || i+j==n-1 ) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for (int j=0; j<n; j++)
			{		//Y
				if( i==j && i<=(n-1)/2 || i+j==n-1 && j>=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("   ");
			
			for (int j=0; j<n; j++)
			{		//Z
				if(  i+j==n-1 || i==(n-1) || i==0) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			fp++;
			sp--;
		}


	}

}


