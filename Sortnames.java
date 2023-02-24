import java.io.*;

class Sortnames {
	public static void main(String[] args)
	{
		int i,n;
		String names[]= new String[10000];
		String temp,str1,str2;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("How many names are needed to be sorted");
			str2 = dis.readLine();
			n = Integer.parseInt(str2);
			System.out.println("Enter the names one by one.");
			for(i=0;i<n;i++)
			{
				names[i] = dis.readLine();
			}
			for (i = 0; i < n; i++) 
			{
				for (int j = i + 1; j < n; j++)
				{
					if (names[i].compareTo(names[j]) > 0)
					{
						temp = names[i];
						names[i] = names[j];
						names[j] = temp;
					}
				}
			}
			System.out.println("Names in Order");
			System.out.println("---------------");
			for (i = 0; i < n; i++) 
			{
				System.out.println(i+1+". "+" "+names[i]);
			}
		}catch(IOException e) {System.out.println(e);}
	}
}
