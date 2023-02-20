import java.io.*;
import java.lang.*;
import java.nio.file.*;
import java.util.*;

public class ShoppingList
{
	public static void main(String args[])
	{
		try
		{
			int b[],c[],ip[],n,i,j,tp=0;
			String a[];
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter The Number of Enteries:");
			n=Integer.parseInt(dis.readLine());
			a=new String[n];
			b=new int[n];
			c=new int[n];
			ip=new int[n];
			tp =0;
			System.out.println("Enter the Items :");
			for(i=0;i<n;i++)
			{
				a[i]=dis.readLine();
			}
			System.out.println("Enter Quantity :");
			for(i=0;i<n;i++)
			{
				b[i]=Integer.parseInt(dis.readLine());
			}
			System.out.println("Enter price per Quantity :");
			for(i=0;i<n;i++)
			{
				c[i]=Integer.parseInt(dis.readLine());
			}
			for(i=0;i<n;i++)
			{
				ip[i]=b[i]*c[i];
			}
			for(i=0;i<1;i++)
			{
				for(j=i+1;j<n;j++)
				{
					tp=tp+ip[j];
				}
				tp=tp+ip[i];
			}
			System.out.println();
			System.out.println("\t\tShopping List List		 ");
			System.out.println("--------------------------------------");
			System.out.println();
			System.out.println("Sl No \t\t Item \t\t Quantity \t\t  Price per Quantity \t\t Item Price \t\t"); 
			System.out.println("------\t\t------\t\t----------\t\t---------------------\t\t-------------\t\t");
			System.out.println();
			for(i=0;i<n;i++)
			{
				System.out.println(i+1 +"\t\t"+a[i]+ "\t\t"+b[i]+ "\t\t\t\t"+c[i]+"\t\t\t\t"+ip[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t Total Price = " +tp);
			System.out.println("_______________________________________________________________________________________________________");
		}
		catch(IOException e){System.out.println(e);}
	}
}