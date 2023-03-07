import java.io.*;

public class Contacts{

    public static void main(String[] args) {
        try {
            DataInputStream din = new DataInputStream(System.in);
		System.out.print("Enter your name: ");
            String name = din.readLine();
            System.out.print("Enter your name: ");
            String name = din.readLine();
            System.out.print("Enter your address: ");
            String address = din.readLine();
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
