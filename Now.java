// Today's Date and Time 
import java.io.*;
import java.time.*;
public class Now 
{
    public static void main(String[] args)
	{
        LocalDateTime LCT = LocalDateTime.now();
        System.out.println("Time and Date today : " + LCT);
    }
}