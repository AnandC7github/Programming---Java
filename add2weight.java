import java.io.*;
import java.lang.*;

class weight
{
	String str,str1;
	int kg;
	int g;
	void read()
	{
		DataInputStream dis = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the kilogram (kg) weight : ");
			str = dis.readLine();
			kg = Integer.parseInt(str);
			System.out.println("Enter the gram (g) weight : ");
			str1 = dis.readLine();
			g = Integer.parseInt(str1);
		}
		catch(IOException e) {System.out.println(e);}
	}
	weight add(weight wgt2)
	{
		weight w = new weight();
		w.kg = this.kg+wgt2.kg;
		w.g = this.g+wgt2.g;
		if(w.g>1000)
		{
			w.g = w.g - 1000;
			w.kg = w.kg+1;
		}
		System.out.println("Sum = "+w.kg+ "kg "+w.g+"g");
		return w;
	}
}

class add2weight
{
	public static void main(String args[])
	{
		weight wgt1 = new weight();
		wgt1.read();
		weight wgt2 = new weight();
		wgt2.read();
		weight wgt3 = new weight();
		wgt3 = wgt1.add(wgt2);
	}
}