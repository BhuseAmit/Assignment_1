package javaangers;

public class assignment1 {

	public static void main(String[] args) {
		int n=9;
		System.out.println("  ");
		
		for(int i=0; i<n; i++)
		{ for(int j=0; j<n; j++)
				// A
			{ if(i==0&&j>0&&j<n-1 || j==0&&i>0 ||j==n-1&&i>0 || i==(n-1)/2)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
				//M
			{ if(j==0 ||j==n-1 || i==j&&i<=(n-1)/2 || i+j==n-1&& i<=(n-1)/2)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
				//I
			{ if(i==0 || i==n-1 || j==(n-1)/2)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
			{ 	//T
				if(i==0 ||  j==(n-1)/2)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.print("     ");
			
			for(int j=0; j<n; j++)
				//B
			{ if(j==0 ||i==0&&j<n-1 ||i==(n-1)/2&&j<n-1 ||i==n-1&&j!=n-1 || j==n-1&&i!=0&&i!=(n-1)/2&&i!=n-1)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
				//H
			{ if(j==0 || j==n-1 ||i==(n-1)/2)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
				//U
			{ if(j==0&&i<n-1 || j==n-1&&i<n-1 ||i==n-1&&j!=0&&j!=n-1)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
				//S
			{ if( i==0 && j!=0 && j!=n-1 || i==n-1 &&j!=0 && j!=n-1 || i==(n-1)/2 &&j!=0 && j!=n-1 || 
					j==0 &&i<(n-1)/2 && i!=0 ||j==n-1 &&i>(n-1)/2 && i!=n-1 || j==0 &&i>3*(n-1)/4 && i!=n-1
					|| j==n-1 && i<(n-1)/4 && i!=0) 
				System.out.print("*");
			  else 
				System.out.print(" ");
			} System.out.print("  ");
			
			for(int j=0; j<n; j++)
				//E
			{ if(i==0 ||j==0 ||i==n-1 ||i==(n-1)/2)
				System.out.print("*");
			  else 
				System.out.print(" ");
			}System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{	//I
				if(i==0 || j==(n-1)/2 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
			{	//N
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
			{	//E
				if(i==0 ||j==0 ||i==n-1 || i==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
			{	//U
				if(j==0&&i!=n-1 || j==n-1&&i!=n-1 || i==n-1&&j!=0&&j!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
			{	//R
				if(j==0 || i==0&&j!=0&& j<n-1 ||j==n-1&& i>0&&i<(n-1)/2 || i==(n-1)/2&&j!=n-1 || i==j&& i>(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
			{	//O
				if(i==0&&j!=0&&j!=n-1 ||j==0&&i!=0&&i!=n-1 ||i==n-1&&j!=0&&j!=n-1 || j==n-1&&i!=0&&i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.print("  ");
			
			for(int j=0; j<n; j++)
			{	//N
				if(j==0 || i==j || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
