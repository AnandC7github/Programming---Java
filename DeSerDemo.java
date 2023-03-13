//Converting a byte stream into data members - deserialization
// no need to create s ; we need to open s and read it then convert it. ( We use InputStream)

import java.io.*;
import java.lang.*;
class DeSerDemo
{
	public static void main(String args[])
	{
		Student s = null; //AS we dont need ot create an object so bnull
		// Serialization (we use file output stream)
		try
		{
		FileInputStream fin = new FileInputStream("E:\\java\\s.txt"); // path must be given in FOStream();
		ObjectInputStream ois = new ObjectInputStream(fin); //Fout is where it must be given
		//read portion from ObjectInputStream - read Method
		s = (Student)ois.readObject();
		System.out.println("DeSerialization Happened");
		/*System.out.println("Name is :"+s.name);
		System.out.println("Age is :"+s.age);
		System.out.println("RollNO is :"+s.rno); */
		s.disp();
		} catch(IOException e) {System.out.println(e);}
		catch(ClassNotFoundException e) {System.out.println(e);} //for deserialization only
	}
}

// Class is a user defined data type. so we need to convert - so we typecast it.

//Instead of using SOP (s.name, s.rno, s.age), we can use method s.disp(); 