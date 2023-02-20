import java.io.*;
import java.lang.*;

public class Calculator
{
	public static void main(String args[])
	{
		try
		{
			int a,b;
			String c;
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the First Number : ");
			a = Integer.parseInt(dis.readLine());
			System.out.println("Enter the Second Number : ");
			b = Integer.parseInt(dis.readLine());
			System.out.println("Enter the Operator : ");
			c = dis.readLine();
			switch(c)
			{
				case "*" : System.out.println(a*b);
							break;
				case "/" : System.out.println(a/b);
							break;
				case "+" : System.out.println(a+b);
							break;
				case "-" : System.out.println(a-b);
							break;
				default : System.out.println("Wrong Option");
			}
		}catch(IOException e) {System.out.println(e);}
	}
}