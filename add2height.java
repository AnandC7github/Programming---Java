import java.io.*;
import java.lang.*;

class height
{
	String str,str1;
	int f; 			//foot
	int i;			//inch
	void read()
	{
		DataInputStream dis = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the height in feet : ");
			str = dis.readLine();
			f = Integer.parseInt(str);
			System.out.println("Enter the height in inch : ");
			str1 = dis.readLine();
			i = Integer.parseInt(str1);
		}
		catch(IOException e) {System.out.println(e);}
	}
	height add(height hgt2)
	{
		height h = new height();
		h.f = this.f+hgt2.f;
		h.i = this.i+hgt2.i;
		if(h.i>12)
		{
			h.i = h.i - 12;
			h.f = h.f+1;
		}
		System.out.println("Sum = "+h.f+ "feet "+h.i+"inch");
		return h;
	}
}

class add2height
{
	public static void main(String args[])
	{
		height hgt1 = new height();
		hgt1.read();
		height hgt2 = new height();
		hgt2.read();
		height hgt3 = new height();
		hgt3 = hgt1.add(hgt2);
	}
}