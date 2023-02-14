import java.io.*;
import java.lang.*;
abstract class payslip
{  
   double a,b;
   int c,d;
    payslip(double es,int wkt,double pfd,int al)
    {
        a=es;
        b=pfd;
        c=al;
		d=wkt;
    }
    abstract double salary();

   
}
 class expence extends payslip
{    
    
    expence(double es,int wkt,double pfd,int  al)
    {
        super(es,wkt,pfd,al);
    }   
    double salary()
    {   
		int ws = d*250;
        double pf=a*(b/100);
        double sall=a-pf+c+ws;
        return (sall);
    }
    
}   
class EmpPayslip
{   
    public static void main(String args[])
    {
		int ws;
        String name,dept;
        try
        {
        DataInputStream div=new DataInputStream(System.in);
		System.out.println("Enter Employee name :");
		name = div.readLine();
		System.out.println("Enter employee Department :");
		dept = div.readLine();
        System.out.println("Enter the employee salary :  ");
        double es=Integer.parseInt(div.readLine());
		System.out.println("Enter Overtime hours worked  :  ");
        int wkt=Integer.parseInt(div.readLine());
        System.out.println("Enter the Provident Fund percent to be deducted  :  ");
        double pfd=Integer.parseInt(div.readLine());
        System.out.println("Enter the allowance amount :  ");
        int al=Integer.parseInt(div.readLine());
        expence e1=new expence(es,wkt,pfd,al);
        
        double sa=e1.salary();
        double pfo=es*(pfd/100);
		System.out.println();
		System.out.println();
		System.out.println("_________________________________________");
        System.out.println("           EMPLOYEE PAYSLIPS            ");
        System.out.println("_________________________________________");
        System.out.println();
		System.out.print(" EMPLOYEE NAME : "+name);
		System.out.println("    DEPARTMENT    :  "+dept);
		System.out.println();
        System.out.println(" Basic Salary                   :  "+es);
		System.out.println(" Overtime Payment      		:  "+(wkt*250));
        System.out.println(" Provident Fund Amount          :  "+pfo);
        System.out.println(" Allowance amount               :  "+al);
		System.out.println("__________________________________________");
        System.out.println(" Final Salary                   :  "+sa);
		System.out.println("__________________________________________");
		System.out.println();
		System.out.println("Note :");
		System.out.println("   (Overtime hours : "+wkt + "  Each hours income : 250 )  ");
        
        }
        catch(IOException e){System.out.println("Error "+e);}
        
    
        
    }
}