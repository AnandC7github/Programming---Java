import java.io.*;
import java.lang.*;
import java.nio.file.*;
import java.util.*;

public class ToDoList
{
	public static void main(String args[])
	{
		try
		{
			int n,i,j,temp;
			String a[];
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter The Number of Enteries:");
			n=Integer.parseInt(dis.readLine());
			a=new String[n];	
			System.out.println("Enter T-Do List Enteries:");
			for(i=0;i<n;i++)
			{
				a[i]=dis.readLine();
			}
			System.out.println();
			System.out.println("		To-Do List		 ");
			System.out.println("--------------------------------------");
			System.out.println();
			for(i=0;i<n;i++)
			{
				System.out.println(i+1 +".   "+a[i]);
				System.out.println();
			}
			System.out.println(i +" works to be completed.");
			System.out.println("__________________________________");
		}
		catch(IOException e){System.out.println(e);}
	}
}