
public class happy_new_year_2023 {

	public static void main(String[] args) {
	
		int n=9;
		  System.out.println("  ");
		  for(int i=0; i<n;i++)
		  { 
			  for(int j=0; j<2; j++)
			  	{		//vacant space
				
					System.out.print(" ");
				
			  	}
			  	System.out.print("  ");
			  for(int j=0; j<n; j++)
				{		//H
					if(j==n-1|| i==(n-1)/2  || j==0 )
						System.out.print("*");
					else
						System.out.print(" ");
				}
			  System.out.print("  ");
			  for(int j=0; j<n; j++)
				{		//A
					if(i==0 && j!=0 && j!=n-1 || j==0&& i!=0 || j==n-1 && i!=0 || i==(n-1)/2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			  System.out.print("  ");
			  for(int j=0; j<n; j++)
				{	//P
					if(j==0 ||j==n-1 && i>0 && i<(n-1)/2 || i==0 &&  j!=n-1  || i==(n-1)/2 && j!=n-1 )
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				System.out.print("  ");
				for(int j=0; j<n; j++)
				{	//P
					if(j==0 ||j==n-1 && i>0 && i<(n-1)/2 || i==0 &&  j!=n-1  || i==(n-1)/2 && j!=n-1 )
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				System.out.print("  ");
				for (int j=0; j<n; j++)
				{		//Y
					if( i==j && i<=(n-1)/2 || i+j==n-1 && j>=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2) 
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("    ");
				for(int j=0; j<n; j++)
				{	//N
					if(j==0 ||j==n-1 || i==j)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				System.out.print("  ");
				for(int j=0; j<n; j++)
				{		//E
					if(i==0 || i==(n-1)/2 || i==n-1 || j==0 )
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("  ");
				for (int j=0; j<n; j++)
				{		//W 
					if(j==0 || j==n-1  || i==j && i>=(n-1)/2 || i+j==n-1 && j<=(n-1)/2) 
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("    ");
				for (int j=0; j<n; j++)
				{		//Y
					if( i==j && i<=(n-1)/2 || i+j==n-1 && j>=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2) 
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("  ");
				for(int j=0; j<n; j++)
				{		//E
					if(i==0 || i==(n-1)/2 || i==n-1 || j==0 )
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.print("  ");
				  for(int j=0; j<n; j++)
				    {		//A
						if(i==0 && j!=0 && j!=n-1 || j==0&& i!=0 || j==n-1 && i!=0 || i==(n-1)/2)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				  System.out.print("  ");
					for(int j=0; j<n; j++)
					{	//R
						if(j==0 ||i==0 &&j!=n-1 || i==(n-1)/2 && j!=n-1 || j==n-1 && i<(n-1)/2 && i!=0 || i==j && i>=(n-1)/2)
							System.out.print("*");
						else
							System.out.print(" ");
						
					}
					
			  
			  System.out.println();
		  }
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  for(int i=0; i<n; i++)
		  {
			  for(int j=0; j<n; j++)
			  { 		//  vacant space
				 if(i==0)
					  System.out.print(" ");
		  		else
		  			System.out.print(" ");
			  }
			  System.out.print("               ");
			  
			  for(int j=0; j<n; j++)
			  { 		//  hollow Diamond 
			  if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)/2+(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			  }
	     System.out.print("               ");
		     for(int j=0; j<n; j++)
			  { 		// 2
				  if(i==0 || j==n-1 && i<=(n-1)/2 || j==0 && i>=(n-1)/2 || i==n-1 || i==(n-1)/2)
						System.out.print("*");
					else
						System.out.print(" ");
			  }
		     System.out.print("  ");
			  for(int j=0; j<n; j++)
			  {		// 0
				  if(j==0 && i!=0 && i<n-1 ||j==n-1&& i>0 && i<n-1 || i==0 && j!=0 && j!=n-1 || 
							i==n-1 &&j!=0&& j!=n-1 )
						System.out.print("*");
					else
						System.out.print(" ");
				  
			  }
			  System.out.print("  ");
			  for(int j=0; j<n; j++)
			  {		// 2
				  if(i==0 || j==n-1 && i<=(n-1)/2 || j==0 && i>=(n-1)/2 || i==n-1 || i==(n-1)/2)
						System.out.print("*");
					else
						System.out.print(" ");
				  
			  }
			  System.out.print("  ");
			  for(int j=0; j<n; j++)
			  {		// 3
				  if(i==0 && j!=n-1|| j==n-1 && i!=n-1 && i!=(n-1)/2 && i!=0 || i==n-1 && j!=n-1 || i==(n-1)/2 && j!=n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				  
			  }System.out.print("               ");
			  for(int j=0; j<n; j++)
			  { 		//  hollow Diamond 
			  if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)/2+(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			  }
			  System.out.println();
		  }
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  
		   System.out.println("                                                                                                                    From: ");
		   System.out.println("                                                                                                                           AMIT UMESH BHUSE");


	}

}
