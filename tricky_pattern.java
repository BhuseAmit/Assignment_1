
public class tricky_pattern {

	public static void main(String[] args) {

         int n2=6;
		
		for(int i=1; i<n2; i++)
		{
			for(int j=1; j<n2; j++)
			{ 
				System.out.print(i +" ");
			}
			System.out.println();
		}
	    
		System.out.println(); // To print the space between two pattern
		System.out.println();
	    
        int n1= 15;
		for(int i=0; i<n1; i++)
		{
			for(int j=0; j<n1; j++)
			{ 
				if(i==0|| j==0 ||j==n1-1 ||i==n1-1 ||i+j<(n1-1)/2 ||j-i>=(n1-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
		
		System.out.println(); // To print the space between two pattern
		System.out.println();
		
		for(int i=0; i<n1; i++)
		{
			for(int j=0; j<n1; j++)
			{ 
				if(i==0|| j==0  ||i==n1-1 ||i+j<=(n1-1)/2 ||i-j>=(n1-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
		
		System.out.println(); // To print the 2 line space between two pattern
		System.out.println();
		
		for(int i=0; i<n1; i++)
		{
			for(int j=0; j<n1; j++)
			{ 
				if(  i==n1-1 || i==n1-2 ||i+j>=(n1-1)/2+n1 ||i-j>(n1-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
		
		System.out.println(); // To print the 2 line space between two pattern
		System.out.println();
		
		
		for(int i=0; i<=n1-1; i++) 
		{
			
			for(int j=0; j<=n1-1; j++)
			{ 
				if(i==0 || j==0 || i==n1-1 || j==n1-1 || i==j ||i+j==n1-1 ||
						i+j<=(n1-1)/2 ||i-j>=(n1-1)/2 ||j-i>=(n1-1)/2 ||i+j>=n1+(n1-1)/2)
				    System.out.print("*");
				else
					System.out.print(" ");
			} 
			System.out.println();	
		}
		
		System.out.println();
		System.out.println();
		
		int n=8;
		
//	Half pyramid Or right angled triangle 
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{  
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
//		Solid Rectangle
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		System.out.println();
		
//		 Hollow Rectangle
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n ; j++)
			{ if(i==0 ||j==0 || i==n-1 ||j==n-1)
				System.out.print("*");
			else
				System.out.print(" ");
				
			}System.out.println();
		}
		System.out.println();
		System.out.println();

//		 Half inverted pyramid
		for(int i=n; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// Hollow Heart pattern 
				for(int i=0; i<=n; i++)
				{	
					for(int j=0; j<=n; j++)
					{
						if (i==0 && j%(n/2)!=0 && j%2==0||i==1 && j%(n/2)==0 ||i-j==n/4 && i<=3*n/4 || i+j==n+n/4 && i<=3*n/4 
								 || j==n && i>=2 && i<n/4 ||  j==0 && i>=2 && i<n/4)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
				}	
				
				System.out.println();
				System.out.println();
				
				// Hollow Diamond pattern 
				for(int i=0; i<n; i++)
				{	
					for(int j=0; j<n; j++)
					{
						
						if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)/2+(n))
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
				}	
		
	}

}
