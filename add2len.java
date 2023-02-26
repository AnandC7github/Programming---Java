import java.io.*;
import java.lang.*;

class length
{
	String str,str1;
	int km;
	int m;
	void read()
	{
		DataInputStream dis = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the kilometres (km) length : ");
			str = dis.readLine();
			km = Integer.parseInt(str);
			System.out.println("Enter the meters (m) length : ");
			str1 = dis.readLine();
			m = Integer.parseInt(str1);
		}
		catch(IOException e) {System.out.println(e);}
	}
	length add(length len2)
	{
		length l = new length();
		l.km = this.km+len2.km;
		l.m = this.m+len2.m;
		if(l.m>1000)
		{
			l.m = l.m - 1000;
			l.km = l.km+1;
		}
		System.out.println("Sum = "+l.km+ "km "+l.m+"m");
		return l;
	}
}

class add2len
{
	public static void main(String args[])
	{
		length len1 = new length();
		len1.read();
		length len2 = new length();
		len2.read();
		length len3 = new length();
		len3 = len1.add(len2);
	}
}