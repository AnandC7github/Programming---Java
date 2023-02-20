import java.io.*;
import java.lang.*;

class Pattern1
{ 
	public static void main(String[] args)  
	{  
		int size;  
		String c;
		int i,j,k;  
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the Size of Pattern : ");		
			size = Integer.parseInt(dis.readLine());
			System.out.println("Enter the pattern symbol to be printed : ");
			c = dis.readLine();
			for (i=0; i<size+1; i++)
			{ 
				for (j=size; j>i; j--)
				{  
					System.out.print("   ");  
				}  
				for (k = 0; k < (2 * i - 1); k++)
				{  
					System.out.print(" "+c+" ");  
				}  
				System.out.println();  
			}  
		} 
		catch(IOException e) {System.out.println(e);}
	} 
}	
	  